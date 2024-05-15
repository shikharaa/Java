package com.shikhara.threads;

class IncrementThread extends Thread{
	
	private static int count = 0;
	
	static synchronized void increment() {
		 
		 
			 
			 count++;
				System.out.println("Thread: " + Thread.currentThread().getName() + " | Incremented: " + count);
				
		
	}
	
	public   void run() {
		
		for(int i =0; i<5;i++) {
			increment();
		}
	}
}

public class SynchroThread {

	public static void main(String[] args) {

		IncrementThread ic1 = new IncrementThread();
		IncrementThread ic2 = new IncrementThread();
		
		Thread t1 = new Thread(ic1);
		t1.start();
		Thread t2 = new Thread(ic2);
		t2.start();

	}

}
