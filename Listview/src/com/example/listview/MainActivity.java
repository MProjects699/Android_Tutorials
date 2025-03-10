package com.example.listview;

import java.util.ArrayList;

import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	MyCustomAdapter dataAdapter = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Generate list View from ArrayList
		  displayListView();
		  
		  checkButtonClick();
	}

	private void displayListView() {
		  
		  //Array list of countries
		  ArrayList<Country> countryList = new ArrayList<Country>();
		  Country country = new Country("Lion","Gujarat",false);
		  countryList.add(country);
		  country = new Country("Bhajiya","Amreli",true);
		  countryList.add(country);
		  country = new Country("Gathiya","Bhavnagar",false);
		  countryList.add(country);
		  country = new Country("Keri","Junagadh",true);
		  countryList.add(country);
		  country = new Country("Samosa","Surendranagar",true);
		  countryList.add(country);
		  country = new Country("Kali","Gariyadhar",false);
		  countryList.add(country);
		  country = new Country("Penda","Rajkot",false);
		  countryList.add(country);
		  
		  //create an ArrayAdaptar from the String Array
		  dataAdapter = new MyCustomAdapter(MainActivity.this,R.layout.country_info, countryList);
		  ListView listView = (ListView) findViewById(R.id.listView1);
		  // Assign adapter to ListView
		  listView.setAdapter(dataAdapter);
		  
		  
		  listView.setOnItemClickListener(new OnItemClickListener() {
		   public void onItemClick(AdapterView parent, View view,
		     int position, long id) {
		    // When clicked, show a toast with the TextView text
		    Country country = (Country) parent.getItemAtPosition(position);
		    Toast.makeText(getApplicationContext(),
		      "Clicked on Row: " + country.getName(),
		      Toast.LENGTH_LONG).show();
		   }
		  });
		  
		 }
		  
		 private class MyCustomAdapter extends ArrayAdapter<Country> {
		  
		  private ArrayList<Country> countryList;
		  
		  public MyCustomAdapter(Context context, int textViewResourceId,
		    ArrayList<Country> countryList) {
		   super(context, textViewResourceId, countryList);
		   this.countryList = new ArrayList<Country>();
		   this.countryList.addAll(countryList);
		  }
		  
		  private class ViewHolder {
		   TextView code;
		   CheckBox name;
		  }
		  
		  @Override
		  public View getView(int position, View convertView, ViewGroup parent) {
		  
		   ViewHolder holder = null;
		   Log.v("ConvertView", String.valueOf(position));
		  
		   if (convertView == null) {
		   LayoutInflater vi = (LayoutInflater)getSystemService(
		     Context.LAYOUT_INFLATER_SERVICE);
		   convertView = vi.inflate(R.layout.country_info, null);
		  
		   holder = new ViewHolder();
		   holder.code = (TextView) convertView.findViewById(R.id.code);
		   holder.name = (CheckBox) convertView.findViewById(R.id.checkBox1);
		   convertView.setTag(holder);
		  
		    holder.name.setOnClickListener( new View.OnClickListener() {
		     public void onClick(View v) {
		      CheckBox cb = (CheckBox) v ;
		      Country country = (Country) cb.getTag();
		      Toast.makeText(getApplicationContext(),
		       "Clicked on Checkbox: " + cb.getText() +
		       " is selected" ,
		       Toast.LENGTH_LONG).show();
		      country.setSelected(cb.isChecked());
		     }
		    });
		   }
		   else {
		    holder = (ViewHolder) convertView.getTag();
		   }
		  
		   Country country = countryList.get(position);
		   holder.code.setText(" (" +  country.getCode() + ")");
		   holder.name.setText(country.getName());
		   holder.name.setChecked(country.isSelected());
		   holder.name.setTag(country);
		  
		   return convertView;
		  
		  }
		  
		 }
		  
		 private void checkButtonClick() {
		  
		  
		  Button myButton = (Button) findViewById(R.id.findSelected);
		  myButton.setOnClickListener(new OnClickListener() {
		  
		   @Override
		   public void onClick(View v) {
		   StringBuffer responseText = new StringBuffer();
		    responseText.append("The following were selected...\n");
		  
		    ArrayList<Country> countryList = dataAdapter.countryList;
		    
		    for(int i =0; i< countryList.size();i++)
		    {
		      Country country = countryList.get(i);
		     if(country.isSelected()){
		      responseText.append("\n" + country.getName());
		     }
		    }
		  
		    Toast.makeText(MainActivity.this,responseText, Toast.LENGTH_LONG).show();
		  
		   }
		  });
		  
		 }

}
