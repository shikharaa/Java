package com.shikhara.threads;


class Mytable {
	
	synchronized void showTa(int n) throws InterruptedException {
		
		for(int i=1; i <=10; i++) {
			System.out.println(n + "*" + i + ":" + i*n);
			Thread.sleep(1000);
		}
		
	}
}

class shikhara1 extends Thread{

	Mytable mt;
	public shikhara1(Mytable mt) {
		this.mt = mt;
	}
	
	public void run() {
		
		try {
			mt.showTa(2);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	
	
}


class shikhara2 extends Thread{

	Mytable mt;
	public shikhara2(Mytable mt) {
		this.mt = mt;
	}
	
	public void run() {
		
		try {
			mt.showTa(3);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	
	
}



public class SyncroThread {

	public static void main(String[] args) throws InterruptedException {
		Mytable mt = new Mytable();
		shikhara1 t1 = new shikhara1(mt);
		t1.start();
		shikhara2 t2 = new shikhara2(mt);
		t2.start();
		//mt.show(2);
	}

}
