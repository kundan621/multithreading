package com.multi.interrupts;

class InterruptNormalRunningThread extends Thread{

    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println(i);
    }

    public static void main(String args[]){
        InterruptNormalRunningThread t1=new InterruptNormalRunningThread();
        t1.start();

        t1.interrupt();

    }
}