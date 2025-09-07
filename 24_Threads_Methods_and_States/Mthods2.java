
class MyThread extends Thread {
    public void run() {
        try {
            // TIMED_WAITING (sleeping)
            Thread.sleep(1000);

            // Just doing some work (RUNNABLE)
            for (int i = 0; i < 3; i++) {
                System.out.println("Working... " + i);
                Thread.sleep(500); // again goes TIMED_WAITING
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Mthods2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();

        // State: NEW
        System.out.println("State after creation (before start): " + t1.getState());

        t1.start();
        // State: RUNNABLE (thread started but not finished yet)
        System.out.println("State just after start: " + t1.getState());

        Thread.sleep(200); 
        // Should be TIMED_WAITING (inside sleep)
        System.out.println("State while sleeping: " + t1.getState());

        Thread.sleep(2000); 
        // By now thread may still be running or already terminated
        System.out.println("State after some time: " + t1.getState());

        t1.join(); // wait for thread to finish
        // State: TERMINATED
        System.out.println("State after completion: " + t1.getState());
    }
}