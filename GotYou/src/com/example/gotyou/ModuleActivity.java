package com.example.gotyou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class ModuleActivity extends Activity {
	ListView listView;
	ImageButton imageButton;
	EditText editText;
	List<String> modules;
	Map<String, ArrayList<String>> modulesFillieres=
			new HashMap<String, ArrayList<String>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		modulesFillieres.put("Task1", new ArrayList<String>());
		modulesFillieres.put("Task2", new ArrayList<String>());
		modulesFillieres.put("Task3", new ArrayList<String>());
		modulesFillieres.put("Task4", new ArrayList<String>());
		
		modulesFillieres.get("Task1").add("Description");
		modulesFillieres.get("Task1").add("Adress");
		modulesFillieres.get("Task1").add("Position");
		modulesFillieres.get("Task1").add("Date");
		
		modulesFillieres.get("Task2").add("Description");
		modulesFillieres.get("Task2").add("Adress");
		modulesFillieres.get("Task2").add("Position");
		modulesFillieres.get("Task2").add("Date");
		
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_module);
		listView=(ListView)findViewById(R.id.listView1);
		imageButton=(ImageButton) findViewById(R.id.imageButton1);
		editText=(EditText) findViewById(R.id.editText1);
		String fil=getIntent().getExtras().getString("Filiere");
		modules=modulesFillieres.get(fil);
		final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, modules);
		listView.setAdapter(adapter);
		
		imageButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String task=editText.getText().toString();
				modules.add(task);
				adapter.notifyDataSetChanged();
				editText.setText("");
				
			}
		});
		
	}
	
	

}
