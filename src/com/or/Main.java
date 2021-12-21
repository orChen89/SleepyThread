package com.or;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new SleepyThread(5000);
        Thread t2 = new SleepyThread(2000);

        t1.start();
        t2.start();
    }
}
