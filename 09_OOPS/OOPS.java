
class Human{
    String name;
    int age;

    void printDetails() {
        System.out.println("Name is : " + name + ", Age is : " + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Human Male = new Human();
        Male.name = "Harsh";
        Male.age = 19;

        Male.printDetails();
    }
}
