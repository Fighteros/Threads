/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Ahemd M. Abd El-Ghany
 */
class Counter {

    int count;

    public synchronized void increatment() {
        count++;
    }
}

public class sync {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(
                new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increatment();
                }
            }
        }
        );

        Thread t2 = new Thread(
                new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increatment();
                }
            }
        }
        );

        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println("Count " + c.count);
    }
}
