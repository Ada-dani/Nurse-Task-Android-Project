package com.example.gotyou;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab1Activity extends ListActivity {
	String[] filieres=new String[]
			{"Task1", "Task2", "Task3","Task4"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_tab1);
		ArrayAdapter<String>adapter= new ArrayAdapter<String>
		(this, android.R.layout.simple_list_item_1,filieres);
		setListAdapter(adapter);
		ListView listView=getListView();
		listView.setOnItemClickListener
		(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> 
			parent, View view, int position, long id) {
				//String fil=((TextView)view).getText().toString();
			String fil = filieres[position];
			
			Intent intent = new Intent(getApplicationContext(),ModuleActivity.class);
			intent.putExtra("filiere", fil);
			startActivity(intent);
			}
		});
		
	}

}
