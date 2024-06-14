package com.shikhara.InterviewPracticeCoding;


class Swap{
	public void swap(int a, int b ) {
		
		a = a+ b;
		b = a-b;
		a = a-b;
		System.out.println("After swap: a = " + a + ", b = " + b);
		
	}
	
}
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swap s1 = new Swap();
		s1.swap(5, 3);

	}

}
