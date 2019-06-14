package com.multi.daemon;

public class MainClass {

    public static void main(String args[]){



     MultiThreadUsingRunnable runnable=new MultiThreadUsingRunnable();
     Thread multi=new Thread(runnable);
     multi.setName("Thread one");
     multi.start();



        Runnable runnable2=new MultiThreadUsingRunnable2();
        Thread multi2=new Thread(runnable2);
        multi2.setDaemon(true);
        multi2.setName("Thread two");
        multi2.start();

    while(multi2.isAlive()){
        System.out.println(multi.getState());

    }


    }
}
