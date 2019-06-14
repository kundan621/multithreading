package com.multi.thread;

public class MultiThreadUsingThreadClass extends Thread {

    public void run(){ //running
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"  "+ i);
            try {
                Thread.sleep(500); //blocked phase
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //terminated phase

}
