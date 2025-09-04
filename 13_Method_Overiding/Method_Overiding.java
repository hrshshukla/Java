class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Method_Overiding {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.sound();
    }
}
