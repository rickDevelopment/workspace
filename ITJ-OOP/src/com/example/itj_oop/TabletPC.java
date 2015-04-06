package com.example.itj_oop;

public class TabletPC extends Computer implements IComputer {

	public TabletPC() {
	}

	public TabletPC(float cpuSpeedMhz, float hdSizeMB, int ramInGB,
			String osName) {
		this.setCpuSpeedMhz(cpuSpeedMhz);
		this.setHdSizeMB(hdSizeMB);
		this.setRamInGB(ramInGB);
		this.setOsName(osName);
	}

	public String turnPowerOn() {
		String output = "";
		output += super.turnPowerOn();
		output += "Tablet PC is Ready!\n";
		return output;
	}

	public String turnPowerOff() {
		String output = "";
		setIsRunning(false);
		output += "Good Bye!\n";
		return output;
	}

	public String runDiagnostics() {
		String output = "";
		output += "================================";
		output += "Tablet Diagnostics:\n";
		output += this.getOsName() + "\n";
		output += (this.getCpuSpeedMhz() / 1000) + " Ghz\n";
		output += this.getHdSizeMB() + " MB\n";
		output += (this.getRamInGB() * 1024) + " MB\n";
		output += "Currently running: " + getIsRunning() + "\n";
		output += "================================";
		return output;
	}

}
