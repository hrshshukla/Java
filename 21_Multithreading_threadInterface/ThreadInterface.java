class myThread1 implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("I'm doing task -> 1");
        }
    }
}

class myThread2 implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("I'm doing task -> 2");
        }
    }
}

public class ThreadInterface {
    public static void main(String[] args) {
        
        myThread1 bullet1 = new myThread1(); // Step 1: create a object of Runnable interface
        Thread gun1 = new Thread(bullet1); // Step 2 : pass that Runnable object to Thread() constructor 

        myThread2 bullet2 = new myThread2();
        Thread gun2 = new Thread(bullet2);
        
        gun1.start();
        gun2.start();

    }
}
