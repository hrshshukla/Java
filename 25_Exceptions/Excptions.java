import java.util.Scanner;

public class Excptions {
    public static void main(String[] args) {
        int arr[] = { 20, 30, 40 };

        System.out.println("Enter Index : ");
        Scanner sc = new Scanner(System.in);
        int indx = sc.nextInt();


        System.out.println("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        try {
            System.out.println("Result is : " + arr[indx]/number);
        } 
    //  catch(Exception e){System.out.println(e);} --> Trigger for all types of Exception
        catch(ArithmeticException e){System.out.println(e);} // --> Only trigger when we do "value/0" 
        catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);} // Only trigger when we do "arr[OutOfBound]"
    }
}
