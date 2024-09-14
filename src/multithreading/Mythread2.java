package multithreading;

public class Mythread2 extends Thread {
    public void run() {
        while(true){
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        Mythread2 thread1 = new Mythread2();
        thread1.setDaemon(true);
        thread1.start();
        System.out.println("Main done");
    }
}
