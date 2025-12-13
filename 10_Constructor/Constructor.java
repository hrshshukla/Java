class Human {
    String name;
    int age;

    Human(){
        System.out.println("I'm human");
    }

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    void details(){
        System.out.println(this.name != null ? "My name is : " + this.name+ " And age is : " + this.age : "I have no name & age");
    }
    
}

public class Constructor {
    public static void main(String[] args) {
        Human Male = new Human();
        Male.details();

        Human Male2 = new Human("Harsh", 19);
        Male2.details();
    }
}
