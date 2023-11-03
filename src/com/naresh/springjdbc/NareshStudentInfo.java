package com.naresh.springjdbc;

public class NareshStudentInfo {

	
	 private int sid;
	 private String sname;
	 private int sfee;
	public NareshStudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NareshStudentInfo(int sid, String sname, int sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
	}
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
	public int getSfee() {
		return sfee;
	}
	public void setSfee(int sfee) {
		this.sfee = sfee;
	}
	@Override
	public String toString() {
		return "NareshStudentInfo [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}
	 
	  
}
