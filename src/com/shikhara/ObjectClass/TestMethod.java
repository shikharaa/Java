package com.shikhara.ObjectClass;

import java.lang.reflect.Method;

public class TestMethod {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int count = 0;
		Class c= Class.forName("java.lang.Object");
		Method m[] = c.getDeclaredMethods();
		
		  for(Method m1:m) {
			  
			  count++;
		  
		  System.out.println(count +":" + m1); 
		  
		  }
		 

	}

}


/*
 * Output for above program
 * 
 * 1:protected void java.lang.Object.finalize() throws java.lang.Throwable
 * 2:public final void java.lang.Object.wait(long,int) throws
 * java.lang.InterruptedException 3:public final void java.lang.Object.wait()
 * throws java.lang.InterruptedException 4:public final native void
 * java.lang.Object.wait(long) throws java.lang.InterruptedException 5:public
 * boolean java.lang.Object.equals(java.lang.Object) 6:public java.lang.String
 * java.lang.Object.toString() 7:public native int java.lang.Object.hashCode()
 * 8:public final native java.lang.Class java.lang.Object.getClass() 9:protected
 * native java.lang.Object java.lang.Object.clone() throws
 * java.lang.CloneNotSupportedException 10:public final native void
 * java.lang.Object.notify() 11:public final native void
 * java.lang.Object.notifyAll()
 */