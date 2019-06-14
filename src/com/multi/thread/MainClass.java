package com.multi.thread;

public class MainClass {

    public static void main(String args[]) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        System.out.println("Csebuddy");
        System.out.println("Csebuddy");
        System.out.println("Csebuddy");
        System.out.println("Csebuddy");
        System.out.println("Csebuddy");



        //long time taking task
        MultiThreadUsingThreadClass multi=new MultiThreadUsingThreadClass(); //new stage of thread
        multi.setName("T0");
        multi.start(); //runnable phase

        //further code
        System.out.println("Csebuddy");
        System.out.println("Csebuddy");
        System.out.println("Csebuddy");
        System.out.println("Csebuddy");
        System.out.println("Csebuddy");




    }
}
