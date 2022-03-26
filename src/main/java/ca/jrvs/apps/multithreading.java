<<<<<<< HEAD
package ca.jrvs.apps;

class MultithreadingDemo implements Runnable {
    public void run(){
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        for (int i = 0; i<8; i++){
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
            System.out.println("hello");

        }
    }
}
=======
package ca.jrvs.apps;

class MultithreadingDemo implements Runnable {
    public void run(){
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        for (int i = 0; i<8; i++){
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
            System.out.println("hello");

        }
    }
}
>>>>>>> 4b6da9e7b1cf6e7c548213835c923b65a1ff8c35
