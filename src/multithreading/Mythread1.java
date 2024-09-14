package multithreading;

public class Mythread1 extends Thread {
    public Mythread1(String name) {
        super(name);
    }
    public void run(){
        /*System.out.println(Thread.currentThread().getName());
        for(int i=0; i<=5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }*/
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+ " is running");
            Thread.yield();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        /*Mythread1 t1 = new Mythread1("koushik"); //Naming a thread
        t1.start();
        t1.join();
        System.out.println("Hey");*/
        Mythread1 t1 = new Mythread1("t1");
        Mythread1 t2 = new Mythread1("t2");
        t1.start();
        t2.start();
    }
}
