package com.example.itj_assignment2;

import com.example.itj_assignment2.R;
//import android.R;
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
		String sOut = "";
		
//		int firstNumber = 10;
//		int secondNumber = 15;
//		
//		sOut += firstNumber + " + " + secondNumber + "=" + (firstNumber + secondNumber) + "\n";
//		sOut += firstNumber + " - " + secondNumber + "=" + (firstNumber - secondNumber) + "\n";
//		sOut += firstNumber + " * " + secondNumber + "=" + (firstNumber * secondNumber) + "\n";
//		sOut += firstNumber + " / " + secondNumber + "=" + (firstNumber / secondNumber) + "\n";
//		
//		
		Calc oCalc1 = new Calc();
		oCalc1.setFirstNumber(10);
		oCalc1.setSecondNumber(15);
		sOut += oCalc1;
		
		txtOutput.setText(sOut);
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
