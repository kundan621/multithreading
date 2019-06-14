package com.multi.interrupts;

class InterruptThreadNotWorking extends Thread{

    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("task");
        }catch(InterruptedException e){
            System.out.println("Exception handled "+e);
        }
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        InterruptThreadNotWorking t1=new InterruptThreadNotWorking();
        t1.start();

        t1.interrupt();

    }
}