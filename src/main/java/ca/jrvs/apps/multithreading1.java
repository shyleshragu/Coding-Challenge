package ca.jrvs.apps;

//class MultithreadingDemo extends Thread {
//    public void run(){
//        try {
//            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
//        } catch (Exception e){
//            System.out.println("Exception");
//        }
//    }
//}
//
//public class multithreading {
//    public static void main(String[] args) {
//        for (int i = 0 ; i < 8; i++){
//            MultithreadingDemo obj = new MultithreadingDemo();
//            obj.start();
//            System.out.println("hello");
//        }
//    }
//}

// A Java program to demonstrate working of
// synchronized.
import java.io.*;
import java.util.*;

class Sender
{
    public void send(String msg)
    {
        System.out.println("Sending\t"  + msg );
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// Class for send a message using Threads
class ThreadedSend extends Thread
{
    private String msg;
    Sender  sender;

    // Recieves a message object and a string
    // message to be sent
    ThreadedSend(String m,  Sender obj)
    {
        msg = m;
        sender = obj;
    }

    public void run()
    {
        // Only one thread can send a message
        // at a time.
        synchronized(sender)
        {
            // synchronizing the snd object
            sender.send(msg);
        }
    }
}

// Driver class
class SyncDemo
{
    public static void main(String args[])
    {
        Sender snd = new Sender();
        ThreadedSend S1 =
                new ThreadedSend( " Hi " , snd );
        ThreadedSend S2 =
                new ThreadedSend( " Bye " , snd );

        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();

        // wait for threads to end
        try
        {
            S1.join();
            S2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}