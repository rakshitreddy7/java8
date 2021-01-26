package com.rakshit.java8.lambdas.runnable;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> System.out.println("In run() of Runnable and is run by the thread " + Thread.currentThread().getName());

        Thread thread = new Thread(runnable);

        thread.start();

        Thread.sleep(2000);

        System.out.println("Resumed by the thread " + Thread.currentThread().getName());
    }
}
