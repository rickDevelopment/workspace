package com.example.itj_variables;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Variables extends Activity {

	static final double PI = 3.141593;
	int iGlobal = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_variables);
		
		//TextView txtOutput = (TextView) findViewById(R.id.txtOutput);
		String sOutput = "";
		
		//declaring variables
		char capitalC = 'C';
		int iCount = 0;
		
		short a, b, c;
		a = 10;
		b = 20;
		c = 5;
		
		String sHello = "Hello";
		String sWorld = "World";
		
		//Pre-fix & Post-fix Examples (increment and decrement) 
		//+ concatenates
		sOutput += "iCount = " + iCount + "\n"; //0 - Current value
		sOutput += "iCount++ = " + (iCount++) + "\n"; //Equal to 0, then increment to 1(Postfix example)
		sOutput += "iCount = " + iCount + "\n"; // Now Equal to 1
		sOutput += "++iCount = " + (++iCount) + "\n"; //Equal to 2 (Prefix example)
		
		//Order of execution 
		sOutput += "a + b = " + a + b + "\n"; //concatenates a+b instead of adding values it sees them as strings Result= 1020
		sOutput += "a + b = " + (a + b) + "\n";// a + b = 30 (order of operation "()")
		sOutput += "a + b / c = " + (a + b /c) + "\n"; // 20 / 5 = 4, then 4 + 10 = 14
		sOutput += "(a + b) / c = " + ((a + b) / c) + "\n"; // 10 + 20 = 30 , then 30 / 5 = 6 
		
		//and concatenation Examples
		sOutput += sHello + "" + sWorld + "\n";
		
		//Declare two string values
		String sNum1 = "10";
		String sNum2 = "20";
		
		sOutput += " sNum1 + sNum2 = " + (sNum1 + sNum2) + "\n";//Result = 1020 as both values are strings
		sOutput += " sNum1 + sNum2 = " + (Integer.parseInt(sNum1) + Integer.parseInt(sNum2)) + "\n";//20 +10 = 30 (Strings are converted to integer using"wrapper funcion")
		
		//Methods
		sOutput += "addNumbers(a,b) = " + addNumbers(a, b) +"\n";
		sOutput += "addNumbers(1, 10, c) = " + addNumbers(1, 10, c) + "\n";
		
		//txtOutput.setText(sOutput);
		iGlobal = 100;
		sOutput += "iGlobal = " + iGlobal + "\n";
		
		sOutput += "PI = " + PI + "\n";
		
		
		createOutput(sOutput);
		
	}//end of onCreate method

	
	int addNumbers(int iFirst, int iSecond){
			return iFirst + iSecond;
	}
	
	int addNumbers(int iFirst, int iSecond, int iThird){
			return iFirst + iSecond + iThird;
	}

	
	void createOutput(String sText) {
		TextView txtOutput = (TextView)findViewById(R.id.txtOutput);
		txtOutput.setText(sText);
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
