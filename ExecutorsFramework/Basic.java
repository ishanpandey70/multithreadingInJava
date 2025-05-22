package ExecutorsFramework;

public class Basic {

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
             threads[i-1] = new Thread(() -> {
                System.out.println(factorial(finalI));
            }, "Thread" + i);
            threads[i-1].start();
        }
        ;
        //now we wait for all threads to finish
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
