package ImplementingRunnableInterface;
public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("ThreadTester main method started");
        Thread thread = new Thread(new Thread1(),  "Thread1");
        thread.start();
        System.out.println("ThreadTester main method finished");
    }
}
