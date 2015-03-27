package com.example.itj_assignment1;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class SimpleCalc extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_calc);
		
		
		TextView txtOutput = (TextView) findViewById(R.id.txtOutput);
		String sOutput = "";
		
		//declare variables 
		int FirstNumber = 20;
		int SecondNumber = 10;
		
		sOutput += "FirstNumber + SecondNumber = " + (FirstNumber + SecondNumber) + "/n";
		sOutput += "FirstNumber - SecondNumber = " + (FirstNumber - SecondNumber) + "/n";
		sOutput += "FirstNumber * SecondNumber = " + (FirstNumber * SecondNumber) + "/n";
		sOutput += "FirstNumber / SecondNumber = " + (FirstNumber / SecondNumber) + "/n";
		
		
		txtOutput.setText(sOutput);
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
}