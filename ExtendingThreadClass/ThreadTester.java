public class ThreadTester {
    public static void main(String[] args) {
       System.out.println("ThreadTester main method started");
        Thread1 thread = new Thread1();
        thread.start();
        System.out.println("ThreadTester main method finished");
    }
}