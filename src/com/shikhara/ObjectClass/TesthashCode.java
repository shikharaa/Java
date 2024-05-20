package com.shikhara.ObjectClass;

import java.util.Objects;
import java.util.concurrent.Callable;

class data implements Cloneable {
	
	int age ;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public data(int age) {
		super();
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	
	  @Override
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	
}


public class TesthashCode {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		data d = new data(5);
		data d1 = (data) d.clone();
		System.out.println(d.getAge());
		System.out.println(d1.getAge());
		
		//System.out.println(d.toString());

	}

}
