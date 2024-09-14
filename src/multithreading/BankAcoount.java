package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAcoount {
    private int balance =100;

    private final Lock lock = new ReentrantLock();


    public void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread() + " attempting to ");
        /*if(balance >= amount){  //Using SYNCHRONIZED
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl ");
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawl. Remaining balance " +balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " insufficient balance ");
        }*/
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl ");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " after withdrawl ");
                    }
                    catch(InterruptedException e){

                    }
                    finally{
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName() + " insufficient balance ");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later ");
            }
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }
}
