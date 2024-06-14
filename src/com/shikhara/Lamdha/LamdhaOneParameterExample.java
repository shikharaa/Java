package com.shikhara.Lamdha;



interface Hello{
	
	public String Say(String name);
}
public class LamdhaOneParameterExample {

	public static void main(String[] args) {
		
		
		Hello t1= (name)->{
			
			return "Hi " + name;
		};
		
		System.out.println(t1.Say("Shikhara"));
		
		
		Hello t2= name ->{
			
			return  name;
		};
		
		System.out.println(t2.Say("Akavaram"));
		

	}

}
