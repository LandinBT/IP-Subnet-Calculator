package com.landinbt.ipsubnetcalculator.module;

public class IPAddress {
	// Attributes
	private String ip;
	private int[] octects;
	
	// Methods
	public IPAddress() {}
	
	public IPAddress(IPAddress ipA) {
		this.ip = ipA.ip;
		this.octects = ipA.octects;
	}
	
	public void setIp(String i) {
		this.ip = i;
	}
	
	public void setOctects(int[] o) {
		this.octects = o;
	}
	
	public String getIp() {
		return ip;
	}
	
	public int[] getOctects() {
		return octects;
	}
	
}
