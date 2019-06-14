package com.multi.mainthread;

public class MainDeadlock {
// Java program to demonstrate deadlock
// using Main thread

    public static void main(String[] args)
    {
        try
        {

            System.out.println("Entering into Deadlock");
            //join will wait for current thread to die then only it will proceed
            Thread.currentThread().join();

            //t1.start();
            //t1.join();
            //t2.start();
           // t3.start();


            // the following statement will never execute
            System.out.println("This statement will never execute");

        }

        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}