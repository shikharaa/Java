//program for testing scope in Java


package com.shikhara.oops;

public class TestScope {
	
	static int classcope = 45;
	
	static public void method1() {
		 
		 int methodscope1 = 56;
		 
	 }
	

	static  public void method2() {
		 
		 int methodscope2 = 56;
		// System.out.println(methodscope1);
		 
	 }

	public static void main(String[] args) {
		
		String name = "shikhara";
		
		System.out.println(name);
		System.out.println(classcope);
		//System.out.println(methodscope1);//error
		//System.out.println(methodscope2);//error
		

	}

}
