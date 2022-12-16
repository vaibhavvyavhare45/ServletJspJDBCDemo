package com.prowings.web.model;

public class Students {
	private int sid;
	private String sname;
	private String scourse;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + "]";
	}
	
	
	

}
