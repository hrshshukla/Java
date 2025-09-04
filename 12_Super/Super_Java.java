// call the constructor of base class from derived class
class base {
    base(){
        System.out.println("I am empty constructor of base class");
    }

    base(int x){
        System.out.println("I'm called with value : " + x);
    }
}

class derived extends base{
    derived(){
        super(10); // this will call --> base(int x)
        System.out.println("I'm constructor of derived class, calling base class constructor");
    }
}

public class Super_Java {
    public static void main(String[] args) {
        derived obj = new derived();
    }
}

