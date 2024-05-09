package com.shikhara.threads;


 class ShikharaThread extends Thread {
	 
	 public void run() {
		 
		 for(int i=1; i<4 ; i++) {
			 
			
			 try {
				 System.out.println("the numbers are:  " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 }
	 }
	
	
}



public class Thread1 {

	public static void main(String[] args) {
		
		ShikharaThread st1 = new ShikharaThread();
		st1.start();
		

	}

}
