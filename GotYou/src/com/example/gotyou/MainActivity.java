package com.example.gotyou;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

public class MainActivity extends TabActivity {
	private TabHost tabHost;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tabHost = (TabHost)findViewById(android.R.id.tabhost);
		TabSpec tab1=tabHost.newTabSpec("First Tab");
		TabSpec tab2=tabHost.newTabSpec("Second Tab");
		TabSpec tab3=tabHost.newTabSpec("Tirth Tab");
		tab1.setIndicator("TAB1");
		tab2.setIndicator("TAB2");
		tab3.setIndicator("TAB3");
		tab1.setContent(new Intent(this, Tab1Activity.class));
		tab2.setContent(new Intent(this, Tab2Activity.class));
		tab3.setContent(new Intent(this, Tab3Activity.class));
		tabHost.addTab(tab1);tabHost.addTab(tab2);tabHost.addTab(tab3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {//interface
		switch (item.getItemId()) {
		case R.id.stats:
			Toast.makeText(this, "Statistiques", Toast.LENGTH_LONG).show();
			return true;
			
		case R.id.contact:
			Toast.makeText(this, "Historique des contact", Toast.LENGTH_LONG).show();
			return true;

		case R.id.quitter:
			
			finish();
			return true;
		
		}
		return false;
	}

}
