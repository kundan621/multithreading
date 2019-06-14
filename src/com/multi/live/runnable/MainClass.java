package com.multi.live.runnable;

public class MainClass {

    public static void main(String args[]){



     MultiThreadUsingRunnable runnable=new MultiThreadUsingRunnable();
     Thread multi=new Thread(runnable);
     multi.setName("Thread one");
     multi.start();



        Runnable runnable2=new MultiThreadUsingRunnable();
        Thread multi2=new Thread(runnable2);
        multi2.setName("Thread two");
        multi2.start();


        SomeOtherTask.doOtherTasks();


    }
}
