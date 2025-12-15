// Inheritance in interface : interface derivedInterface extends baseInterface

interface baseInterface {
    void method1();
    void method2();
}

interface derivedInterface extends baseInterface {
    void method3();
    void method4();
}

class myClass implements derivedInterface {

    @Override
    public void method1() {
        System.out.println("I'm method -> 1");
    }
    
    @Override
    public void method2() {
        System.out.println("I'm method -> 2");
    }
    @Override
    public void method3() {
        System.out.println("I'm method -> 3");
    }
    @Override
    public void method4() {
        System.out.println("I'm method -> 4");
    }
}

public class Interface_inheritance {
    public static void main(String[] args) {
        myClass obj1 = new myClass();
        
        obj1.method1();
    }
}
