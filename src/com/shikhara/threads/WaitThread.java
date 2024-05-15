package com.shikhara.threads;




class IndiaThread1 extends Thread{
	
	String indTeam[] = {"Shikhara", "Akavaram","Reddy"};
	
	public  synchronized void run() {
        for (int i = 0; i < indTeam.length; i++) {
        	try {
        		System.out.println("The India team member is: " + indTeam[i]);
				wait(1000);
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            
        }
    }
	
}


class PakiThread1 extends Thread{
	
	String pakTeam[] = {"Abhijith", "Pinnepu","Reddy"};
	
	public synchronized void run() {
        for (int i = 0; i < pakTeam.length; i++) {
        	try {
				wait(1000);
				 System.out.println("The Pak team member is: " + pakTeam[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
           
        }
    }
	
}




public class WaitThread {

	public static void main(String[] args) {
		
		IndiaThread1 i1 = new IndiaThread1();
		i1.start();
		PakiThread1 p1 = new PakiThread1();
		p1.start();

	}

}
