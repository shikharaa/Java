package com.shikhara.IO;

import java.io.Serializable;
import java.util.Date;

class Data implements Serializable {
	
	private String month;
	
	private Date d;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Data [month=" + month + ", d=" + d + "]";
	}

	public Data(String month, Date d) {
		super();
		this.month = month;
		this.d = d;
	} 
	
	
}


public class CastSerialization {

	public static void main(String[] args) {
		
	//	Data d = new Data("May", "05-23-2024");
		
		



	}

}
