package JAN_19_01_24;


public class PriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        // Set priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Maximum priority
        // Start the threads
        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            System.out.println("Thread: " + thread.getName() + ", Priority:" + thread.getPriority());
        }
    }
}
