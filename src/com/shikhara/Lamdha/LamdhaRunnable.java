package com.shikhara.Lamdha;




public class LamdhaRunnable {
    public static void main(String[] args) {

    	
        Runnable runnable = () -> {
            System.out.println("Thread is running");
        };
        
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
