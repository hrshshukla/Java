// The JVM recevice a ready Queue of multiple Threads : t1, t2, t3, t4, t5 

// java.lang.Thread.MIN_PRIORITY  = 1
// java.lang.Thread.NORM_PRIORITY = 5 (default)
// java.lang.Thread.MAX_PRIORITY  = 10

// Use : setPriority(1...10)
// --> setPriority(10) == setPriority(Thread.MAX_PRIORITY)

// These values [1..10] are passed into Thread.setPriority(int) to assign priorities to Java threads. The default priority of a Java thread is NORM_PRIORITY. A JVM is free to implement priorities in any way if setPriority() is not defined  

class myThread extends Thread {
    myThread(String Name){
        super(Name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("I am thread " + getName());
        }
    }
}

public class Priorites {
    public static void main(String[] args) {
        myThread t1 = new myThread("Thread 1");
        myThread t2 = new myThread("Thread 2");
        myThread t3 = new myThread("Thread 3");
        myThread t4 = new myThread("Thread 4");
        myThread t5 = new myThread("Thread 5 (VIP)");

        t5.setPriority(Thread.MAX_PRIORITY); // same as : t5.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start(); // runs more than others 
        
    }
}
