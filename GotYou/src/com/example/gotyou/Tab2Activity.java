package com.example.gotyou;

import android.support.v7.app.ActionBarActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;


public class Tab2Activity extends Activity {

	ListView listView;
	ImageButton imageButton;
	EditText editText;
	List<String> tasks= new ArrayList<String>();
	//Map<String, ArrayList<String>> modulesFillieres=new HashMap<String, ArrayList<String>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_module);
		listView=(ListView)findViewById(R.id.listView1);
		//imageButton=(ImageButton) findViewById(R.id.imageButton1);
		editText=(EditText) findViewById(R.id.editText1);
		//String fil=getIntent().getExtras().getString("Filiere");
		tasks.add("A");
		tasks.add("B");
		tasks.add("C");
		tasks.add("D");
		tasks.add("E");
		tasks.add("F");
		final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, tasks);
		listView.setAdapter(adapter);
		
		imageButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String task=editText.getText().toString();
				tasks.add(task);
				adapter.notifyDataSetChanged();
				editText.setText("");
				
			}
		});
		
	}
	
	

}

