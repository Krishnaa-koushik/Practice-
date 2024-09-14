package multithreading;

public class Test {
    public static void main(String[] args) {
        /*World world = new World();
       Thread thread = new Thread(world); //NEW STATE
       thread.start(); //RUNNABLE STATE
        for(int i=0;i<10000;i++){
            System.out.println("Hello");
        }*/
        Counter counter = new Counter();
        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){

        }
        System.out.println(counter.getCount());
    }
}