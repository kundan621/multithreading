package com.multi.com.multi.join;

public class MainClass {

    public static void main(String args[]){



     MultiThreadUsingRunnable runnable=new MultiThreadUsingRunnable();
     Thread multi=new Thread(runnable);
     multi.setName("Thread one");             //name of thread
     multi.setPriority(Thread.MAX_PRIORITY); //set priority
     multi.start();                          ///start the thread
        try {
            multi.join();                    ///wait till this thread dies then go to execute others
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //multi.start();
        Runnable runnable2=new MultiThreadUsingRunnable();
        Thread multi2=new Thread(runnable2);
        multi2.setName("Thread two");
        multi2.start();


        SomeOtherTask.doOtherTasks();


    }
}
