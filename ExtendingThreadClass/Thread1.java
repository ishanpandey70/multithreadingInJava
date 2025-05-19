public class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread1 run method started");
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside: "+ Thread.currentThread() + i);
        }
        System.out.println("Thread1 run method finished");
    }
    
}
