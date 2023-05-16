package com.getter_setter;

public class Car {

	private int modno;
	private String carname;
	private int speedlimit;
   
	public void setmodNo(int modno) {
		this.modno = modno;
	}

	public void setcarName(String carname) {
		this.carname = carname;
	}

	public void setspeedLimit(int speedlimit) {
		this.speedlimit = speedlimit;
		
		
	}

	public int getModno() {
		return modno;
	}

	public String getCarname() {
		return carname;
	}

	public int getspeedLimit() {
		return speedlimit;
	}
}
