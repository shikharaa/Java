package com.shikhara.threads;


class IndiaThread extends Thread{
	
	String indTeam[] = {"Shikhara", "Akavaram","Reddy"};
	
	public void run() {
        for (int i = 0; i < indTeam.length; i++) {
        	try {
        		System.out.println("The India team member is: " + indTeam[i]);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            
        }
    }
	
}


class PakiThread extends Thread{
	
	String pakTeam[] = {"Abhijith", "Pinnepu","Reddy"};
	
	public void run() {
        for (int i = 0; i < pakTeam.length; i++) {
            System.out.println("The Pak team member is: " + pakTeam[i]);
        }
    }
	
}



public class JoinThread {

	public static void main(String[] args) throws InterruptedException {

		IndiaThread i1 = new IndiaThread();
		i1.start();
		i1.join();
		PakiThread p1 = new PakiThread();
		p1.start();

	}

}
