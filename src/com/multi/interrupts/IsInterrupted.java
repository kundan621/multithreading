package com.multi.interrupts;

public class IsInterrupted extends Thread{

    public void run(){
        for(int i=1;i<=2;i++){
            if(Thread.currentThread().isInterrupted()){
                System.out.println("code for interrupted thread");
            }
            else{
                System.out.println("code for normal thread");
            }

        }//end of for loop
    }

    public static void main(String args[]){

        IsInterrupted t1=new IsInterrupted();


        t1.start();
        t1.interrupt();

       // t2.start();

    }
}