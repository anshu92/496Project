package com.interaxon.test.libmuse;

import java.util.ArrayList;
import java.util.List;

import com.interaxon.libmuse.Muse;
import com.interaxon.libmuse.MuseManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Navigation extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navigation);
		View raw_data = findViewById(R.id.raw_data);
		raw_data.setOnClickListener(this);
		View calib = findViewById(R.id.calib);
		calib.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		switch (v.getId()) { 
	    case R.id.raw_data:
	        Intent k1 = new Intent(Navigation.this, MainActivity.class);
	        startActivity(k1);
	        //finish();
	        break;
	    case R.id.calib:
	    	Intent k2 = new Intent(Navigation.this, Calibration.class);
	        startActivity(k2);
	        //finish();
	    	break;
	    }
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.navigation, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Intent k = new Intent(Navigation.this, MainActivity.class);
	        startActivity(k);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
