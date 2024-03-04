package org.example.Threading;

class Threading implements Runnable{
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("hi there");

        }
        System.out.println("Runnable without @Override"+Thread.currentThread().getName());
    }
}
class Threads extends Thread {

    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
        System.out.println("Thread without @Override"+Thread.currentThread().getName());

    }
}
public class MainThread{
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(Thread.currentThread().getName());
        Threads t = new Threads();
        t.start();
        t.run();
        Threading th = new Threading();
        Thread thread = new Thread(th);
        thread.start();

        Runnable rn = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hey this is danish");
            }
        };
        rn.run();

    }
}
