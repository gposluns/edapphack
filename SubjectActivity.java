package com.example.edapphack;

import android.support.v7.app.ActionBarActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.widget.DrawerLayout;

public class SubjectActivity extends ActionBarActivity {
	private ActionBarDrawerToggle drawerToggle;
	private DrawerLayout drawerLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_subject);
		
		drawerLayout = (DrawerLayout)findViewById(R.id.subject_drawer);
		drawerToggle = new ActionBarDrawerToggle (this, drawerLayout,R.string.drawer_open, R.string.drawer_close);
		drawerLayout.setDrawerListener(drawerToggle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.subject, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void goToHome (View Button){
		finish();
	}
	
	protected void onPostCreate (Bundle bundle){
		drawerToggle.syncState();		
	}
	
	public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }
}
