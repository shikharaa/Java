package com.shikhara.threads;

class NumberPrinter {
    private int number = 1;
    private final Object lock = new Object();

    public void printNumbers() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ": " + number++);
                lock.wait(); 
            }
        }
    }

    public void notifyPrint() {
        synchronized (lock) {
            lock.notify(); // Notifies the waiting thread to continue
        }
    }
}

public class NotifyThread {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();

        Thread printerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    numberPrinter.printNumbers();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "PrinterThread");

        Thread notifierThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000); 
                    numberPrinter.notifyPrint();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "NotifierThread");

        printerThread.start();
        notifierThread.start();
    }
}
