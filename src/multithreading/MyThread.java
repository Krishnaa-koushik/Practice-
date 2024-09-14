package multithreading;

public class MyThread extends Thread {
    /*public void run(){
        System.out.println("RUNNING");
        try{
           Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }*/
    private Counter counter;
    public MyThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for(int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}


//When to use runnable?
// Use it when your existing class is extending another class
