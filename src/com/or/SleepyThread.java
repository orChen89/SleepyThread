package com.or;

public class SleepyThread extends Thread{

    private final int rate;

    public SleepyThread(int rate) {
        this.rate = rate;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + ": " + "I'm Awake!!");
            try {
                sleep(rate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

