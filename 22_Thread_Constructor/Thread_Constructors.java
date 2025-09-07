// types of thread constructor :
// --> Thread()            : Thread obj1 = new Thread();
// --> Thread(String name) : myThread obj1 = new myThread("first_thread");
// --> Thread(Runnable r)  : Thread gun2 = new Thread(bullet2); ==> bullet two is a Runnable object 
// --> Thread(Runnable r, String name)  : Thread gun2 = new Thread(bullet2, "myThread"); ==> bullet two is a Runnable object 

class myThread extends Thread {
    // myThread's constructor 
    myThread(String Name){
        super(Name); // --> In-built constructor of Thread() provided by java 
    }
}

public class Thread_Constructors {
    public static void main(String[] args) {
        myThread obj1 = new myThread("first_thread");

        System.out.println(obj1.getName()); // --> getName()
        System.out.println(obj1.threadId()); // --> ✅threadId()  ❌getID()
    }
}
