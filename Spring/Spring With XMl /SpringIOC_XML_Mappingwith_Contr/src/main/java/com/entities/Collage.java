package com.entities;

public class Collage {

	private int cid;
	private String cname;

	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collage(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Collage [cid=" + cid + ", cname=" + cname + "]";
	}

}
