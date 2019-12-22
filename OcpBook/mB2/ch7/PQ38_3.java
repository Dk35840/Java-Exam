package mB2.ch7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class PQ38_3 {
     Integer cookies = 0;
 
    public  void deposit(int amount) {
        synchronized(cookies) {
            cookies += amount;
        }
         
 
    }
 
    public  void withdrawal(int amount) {
        synchronized(cookies) {
            cookies -= amount;
        }
     
 
    }
 
    public static void main(String[] amount) throws Exception {
        ExecutorService teller = Executors.newScheduledThreadPool(50);
        PQ38_3 bank = new PQ38_3();
        for (int i = 0; i < 9999; i++) {
            teller.submit(() -> bank.deposit(5));
            teller.submit(() -> bank.withdrawal(5));
        }
        teller.shutdown();
        teller.awaitTermination(100, TimeUnit.SECONDS);
        System.out.print(bank.cookies);
    }
}