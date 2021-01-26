package com.rakshit.java8.lambdas.runnable;

class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("In run() of Runnable and is run by thread " + Thread.currentThread().getName());
    }
}

public class RunnableLegacy {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(2000);
        System.out.println("resumed by the thread " + Thread.currentThread().getName());
    }
}
