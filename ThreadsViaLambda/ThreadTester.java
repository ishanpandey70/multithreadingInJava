package ThreadsViaLambda;

public class ThreadTester {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread1 run method started");
            for (int i = 0; i < 5; i++) {
                System.out.println("Inside: " + Thread.currentThread() + i);
            }
            System.out.println("Thread1 run method finished");
        }, "Thread1");
        thread.start();
        System.out.println("ThreadTester main method started");
    }
}
