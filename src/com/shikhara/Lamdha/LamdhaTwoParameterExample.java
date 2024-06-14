package com.shikhara.Lamdha;



interface Shape{
	
	public void Say(String n1, String n2);
}
public class LamdhaTwoParameterExample {

	public static void main(String[] args) {
		
		
		Shape s1 = (a,b)->{
			
			System.out.println("The Shape is: " +a + " "+ b );
			
		};
		s1.Say("Rectange", "Triangle");
	}

}
