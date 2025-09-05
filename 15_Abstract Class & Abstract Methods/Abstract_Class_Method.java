// Abstract method : --> methods which are only made so that they can be overridden by there child class that's why they contain only definition 
//                   --> Also if a class contain "Abstract" method then it is automatically a "Abstract" class 

// Abstract class : --> Abstract classes are created to set standard for it's child classes
//                  --> We cannot create a object of Abstract class as they are only made to set standards 
//                  --> if a child class is inherited from Abstract parent class then,
//                      either it have to Override the Abstract method given by parent class or make himself another Abstract class 

abstract class parent {
    abstract void greet();
    abstract void goodbye(); // Now the child class must either override greet() and goodbye() or make themselves a abstract class
}

// Option 1: override the methods 
class child1 extends parent{
    @Override
    void greet(){
        System.out.println("Good Morning");
    }

    @Override
    void goodbye(){
        System.out.println("Good bye!");
    }
}

// Option 2: become another abstract class 
abstract class child2 extends parent{
    public void info() {
        System.out.println("I didnt override greet() and goodbye(), So i became abstract class");
    }
}


public class Abstract_Class_Method {
    public static void main(String[] args) {
        // parent Obj = new parent(); --> ❌invalid : cannot create object of a abstract class 
        // child2 Obj = new child2(); --> ❌invalid : cannot create object of a abstract class 

        child1 Obj = new child1(); // ✅ Valid 

        Obj.greet(); // Good Morning
        Obj.goodbye(); // Good bye
    }
}
