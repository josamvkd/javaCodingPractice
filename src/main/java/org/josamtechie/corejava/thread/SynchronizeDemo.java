package org.josamtechie.corejava.thread;

class CounterDemo
{
    int count;
    public synchronized void counter(){
        count++;
    }

}

public class SynchronizeDemo
{
    public static void main(String[] args)
    {
        CounterDemo c = new CounterDemo();

        Runnable obj1 = () ->{
            for (int i=0;i<10000;i++){
                c.counter();
            }
        };

        Runnable obj2 = () ->{
            for (int i=0;i<10000;i++){
                c.counter();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(c.count);

    }
}
