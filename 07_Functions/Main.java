
public class Main {
    // (1) Non-static method
    int sum(int x){
        return x +5;
    }

    // (2) Static method
    static int multiply(int y){
        return 2 * y;
    }

    public static void main(String[] args) {
        // Non-static method 
        Main obj1 = new Main(); // Step 1: create a object first 
        System.out.println(obj1.sum(10)); // Step 2: then call 

        // Static method
        System.out.println(multiply(10)); // direct call 


    }
}
