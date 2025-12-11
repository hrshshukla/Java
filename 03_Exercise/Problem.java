import java.util.*;

public class Problem {
    public static void main(String[] args) {
//      Question 1 : Percentage
//        float marks=0f;
//        int totalSub = 5;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks of");
//
//        for (int i = 1; i <= totalSub; i++){
//            System.out.print("-> Subject "+ i + ": ");
//            marks += sc.nextFloat();
//        }
//
//        System.out.println("Perecentage = " + ((marks/(totalSub*100))*100));
//        System.out.println(marks);

//      Question 2: hasNextInt()
        System.out.print("Verify number: ");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.hasNextInt());

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
