package com.shikhara.Lamdha;


interface Show{
	public void Name();
}

public class LamdhaExample {

	public static void main(String[] args) {
		
		Show d1 = ()->{
			
			System.out.println("Hello");
			
		};
		
		d1.Name();

	}

}
