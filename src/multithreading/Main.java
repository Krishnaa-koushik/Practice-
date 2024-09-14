package multithreading;

public class Main {
    public static void main(String[] args) {
        BankAcoount bankAccount = new BankAcoount();
        Runnable task = new Runnable() {
            public void run() {
                try {
                    bankAccount.withdraw(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        t1.start();
        t2.start();
    }
}
