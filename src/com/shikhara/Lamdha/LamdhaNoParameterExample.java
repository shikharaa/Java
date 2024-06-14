package com.shikhara.Lamdha;



interface Tell{
	public String letSay();
}
public class LamdhaNoParameterExample {

	public static void main(String[] args) {
	
		Tell t1 = ()->{
			
			return "Hello,Welcome to Java 8 Lamdha Expression";			
		};
		
		System.out.println(t1.letSay());
		

	}

}
