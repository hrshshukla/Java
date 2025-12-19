// When obj1 completes start obj2
// obj1.join() 
// obj2.start()

class myThread1 extends Thread {
    myThread1(String Name) {
        super(Name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 4000; i++) {
            // Even if it Sleeps "Thread 2" will not run untill this fully completed 
            try {Thread.sleep(200);} 
            catch (Exception e) {System.out.println(e);}

            // prints "I am Thread 1 doing task1"
            System.out.println("I am " + getName() + " doing task 1");
        }
    }
}

class myThread2 extends Thread {
    myThread2(String Name) {
        super(Name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 4000; i++) {
            System.out.println("I am " + getName() + " doing task 2");
        }
    }
}

public class Mthods {
    public static void main(String[] args) {
        myThread1 obj1 = new myThread1("Thread 1");
        myThread2 obj2 = new myThread2("Thread 2");

        // Step (1)
        obj1.start();
        // obj1.join(); --> this can give error/exception so wrap in try-catch
        try {
            obj1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        // Step (2)
        obj2.start();
    }
}
