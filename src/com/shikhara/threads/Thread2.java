package com.shikhara.threads;




class Mythread implements Runnable{
	
	public void run() {
		
		for( int i =1; i<4; i++) {
			
			try {
				System.out.println("The numbers are: " + i);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}


public class Thread2 {

	public static void main(String[] args) {
		Mythread te = new Mythread();
		Thread a1 = new Thread(te);
		a1.start();
		

	}

}
