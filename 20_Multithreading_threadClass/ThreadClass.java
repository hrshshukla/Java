class myThread1 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("I'm doing task -> 1");
        }
    }
}

class myThread2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("I'm doing task -> 2");
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        
        myThread1 obj1 = new myThread1(); // Step 1: create a object of Runnable interface

        myThread2 obj2 = new myThread2();
        
        obj1.start();
        obj2.start();

    }
}
