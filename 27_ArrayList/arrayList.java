import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(20); // default size 10 

        arrList.add(10); // # add() : [ 10 ]
        arrList.add(0, 5); // [ 5, 10 ]

        arrList.addAll(Arrays.asList(20, 30, 40)); // # addAll() -> To add multiple values together  [ 5, 10, 20, 30, 40 ]
        
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(50, 60, 70)); 
        arrList.addAll(arrayList2); // # merge two arrayList together : [ 5, 10, 20, 30, 40, 50, 60, 70 ]

        // arrList.clear();
        arrList.contains(99); // false
        arrList.indexOf(5); // 0 index
        arrList.lastIndexOf(5); // Returns the index last 5 in the arrList
    //  arrList.remove(0); -->  remove value 5
        arrList.set(0, 6); // --> replace 5 with 6  [ 6, 10, 20, 30, 40, 50, 60, 70 ]

        // Printing arrayList
        for (Integer i : arrList) {
            System.out.println(i);
        }
        
    }


}
