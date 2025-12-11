import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(); // only reads first word, not full line -> "Hello world" = "Hello"
        String str2 = sc.nextLine(); // ready full line  -> "Hello world" = "Hello world"

        System.out.print("Enter num 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter num 2 : ");
        int num2 = sc.nextInt();

        System.out.println("Sum of num1 and num2 : " + (num1 + num2));
    }
}
