import java.util.*;
import java.util.concurrent.Semaphore;

class Q{
    int n;
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semPro = new Semaphore(1);
    public void get(){
        try{
            semCon.acquire();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Get: "+n);
        semPro.release();
    }
    public void put(int n){
        try{
            semPro.acquire();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        this.n=n;
        System.out.println("Put: "+n);
        semCon.release();
    }
}
class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q=q;
    }
    public void run(){
        for(int i=0;i<5;i++){
            q.get();
        }
    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q=q;
    }
    public void run(){
        for(int i=0;i<5;i++){
            q.put(i);
        }
    }
}
public class SemaphoreDemo {
    public static void main(String[] args){
        Q q= new Q();
        new Thread(new Consumer(q),"Consumer").start();
        new Thread(new Producer(q),"Producer").start();
    }
}