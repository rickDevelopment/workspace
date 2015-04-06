package com.example.itj_oop;

public class NotebookPC extends Computer implements IComputer {

	@Override
	public String runDiagnostics() {
		String output = "";
		output += " ================================  ";
		output += "Notebook Diagnostics; \n";
		output +=  this.getOsName() + "\n";
		output +=  (this.getCpuSpeedMhz() /1000) + "Ghz\n";
		output +=  this.getHdSizeMB() + "MB\n";
		output +=  (this.getRamInGB() * 1024) + "MB\n";
		output +=  " Currently running: " + getIsRunning() + "\n";
		output += "=================================";
		return output;
	}
}
