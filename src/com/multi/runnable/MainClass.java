package com.multi.runnable;

public class MainClass {

    public static void main(String args[]){

     MultiThreadUsingRunnable runnable=new MultiThreadUsingRunnable();


      //thread 2
        Runnable runnable2=new MultiThreadUsingRunnable();
        Thread multi2=new Thread(runnable2);//new
        multi2.setName("Thread two");
        multi2.start();//runnable

        //starting the thread twce
      //  multi2.start();
        //directly calling the run method
        //runnable.run();


    }
}
