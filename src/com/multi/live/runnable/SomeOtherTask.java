package com.multi.live.runnable;


public class SomeOtherTask {

    public static void doOtherTasks() {
        try {
            for(int i=10;i>0;i--) {
                System.out.println("Doing something Task will finish in " + i + " Seconds");
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
