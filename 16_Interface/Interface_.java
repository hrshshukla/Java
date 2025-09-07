// Abstract Class : --> It has abstract + non-abstract methods 
//                  --> "extends" keyword is used for inheritance
//                  --> Cannot use multiple abstract class to create one class 

// Interface : --> Only have abstract methods
//             --> All methods inside the interface are always public and cannot be private or protected
//             --> "implement" keyword is used for inheritance  
//             --> Multiple interfaces can be used to create one class => ✅ class child implements interface1, interface2{ }

interface bicycle{
    String height = "32 inches"; // Value set inside Interface is final and Cannot be updated from it's child classes
    void speedIncrease(int increment);
    void speedDecrease(int decrement);
}

class Ranger implements bicycle {
    int speed = 0;
    public void speedIncrease(int increment){
        speed += increment;
        System.out.println("Speed is : " + speed);
    }
    
    public void speedDecrease(int decrement){
        speed -= decrement;
        System.out.println("Speed is : " + speed);
    }
}

public class Interface_ {
    public static void main(String[] args) {
        Ranger myCycle = new Ranger();

        // myCycle.height = "64 inches" --> Cannot be updated

        myCycle.speedIncrease(10);
        myCycle.speedDecrease(10);
    }
}
