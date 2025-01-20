package com.sachintests;

public class ThreadTest extends Thread {
    public void run(){
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.toString());
        }
    }
}
