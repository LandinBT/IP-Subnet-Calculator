package com.landinbt.ipsubnetcalculator.module;

public class Subnet {
	// Attributes
	private String network;
	private String mask;
	private String broadcast;
	private String firstAddress; // network + 1
	private String gateway; // last Address
	
	//usableRange = firstAddress -> gateway
	
	// Methods
	public Subnet() {}
	
	public Subnet(Subnet s) {
		this.network = s.network;
		this.mask = s.mask;
		this.broadcast = s.broadcast;
		this.firstAddress = s.firstAddress;
		this.gateway = s.gateway;
	}
	
	public Subnet(String ip) {
		this.network = ip;
	}
	
	public void calculateMask() {
		String ip = this.network;
		
		
	}
	
	public void setNetwork(String n) {
		this.network = n;
	}
	
	public void setMask(String m) {
		this.mask = m;
	}
	
	public void setBroadcast(String b) {
		this.broadcast = b;
	}
	
	public void setFirstAddress(String fA) {
		this.firstAddress = fA;
	}
	
	public void setGateway(String g) {
		this.gateway = g;
	}
	
	public String getNetwork() {
		return network;
	}
	
	public String getMask() {
		return mask;
	}
	
	public String getBroadcast() {
		return broadcast;
	}
	
	public String firstAddress() {
		return firstAddress;
	}
	
	public String getGateway() {
		return gateway;
	}
	
}
