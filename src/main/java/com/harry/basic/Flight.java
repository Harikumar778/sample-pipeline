package com.harry.basic;

public class Flight {
	
	String to;
	String from;
	String time;
	String vendor;
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Flight(String to, String from, String time, String vendor) {
		super();
		this.to = to;
		this.from = from;
		this.time = time;
		this.vendor = vendor;
	}
	@Override
	public String toString() {
		return "Flight [to=" + to + ", from=" + from + ", time=" + time + ", vendor=" + vendor + "]";
	}
	
	
	
	

}
