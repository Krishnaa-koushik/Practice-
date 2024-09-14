package multithreading;

public class LambdaExpression {
    public static void main(String[] args) {
        //Runnable runnable = () -> System.out.println("Hello");
        Thread t1 = new Thread(() -> System.out.println("Hello"));
    }
}
