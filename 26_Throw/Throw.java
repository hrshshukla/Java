import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        int number = 1000;

        System.out.println("Enter : ");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

    // Method (1) : after throwing custom error the program ends  
        // if (inputNum < 1) {
        //         throw new ArithmeticException("Division by 0"); // Output --> java.lang.ArithmeticException: Division by 0
        // }

    // Method (2) : program doesn't end after throwing custom error, and runs till end 
        if (inputNum < 1) {
                try {
                    throw new ArithmeticException("Division by 0"); // Output --> java.lang.ArithmeticException: Division by 0
                } catch (Exception e) {
                    System.out.println(e);
                }
        }

        System.out.println("Full code is executed 0");
    }
}
