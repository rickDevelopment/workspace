package com.example.itj_oop;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView txtOutput = (TextView) findViewById(R.id.txtOutput);
		String sOut = "";
		
		DesktopPC oDesktop1 = new DesktopPC();//Call DesktopPC class to create an instance of desktop PC called oDesktop1
		oDesktop1.setCpuSpeedMhz(1700);// Using setters to set the CPU speed of oDesktop
		oDesktop1.setHdSizeMB(500);// Using setters to set the HDD size of oDesktop
		oDesktop1.setOsName("Windows");// Using setters to set the OS name of oDesktop
		oDesktop1.setRamInGB(4);// Using setters to set the RAM of oDesktop
		sOut += oDesktop1.turnPowerOn();//Display turnPowerOn() method from DesktopPC class
		sOut += oDesktop1.runDiagnostics();//Display runDiagnostics() method from DesktopPC class
		
		NotebookPC oNote = new NotebookPC();
		oNote.setCpuSpeedMhz(1200);
		oNote.setHdSizeMB(250);
		oNote.setOsName("Windows8");
		oNote.setRamInGB(2);
		sOut += oNote.turnPowerOn();
		sOut += oNote.runDiagnostics();
		
		TabletPC oTablet = new TabletPC(1500, 64, 4, "Android");
		sOut += oTablet.turnPowerOn();
		sOut += oTablet.turnPowerOff();
		sOut += oTablet.runDiagnostics();
		
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
