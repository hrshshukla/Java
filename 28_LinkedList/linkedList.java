
import java.util.LinkedList;
import java.util.Arrays;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>(); // No fixed capacity (unlike ArrayList)

        linkList.add(10); // # add() : [ 10 ]
        linkList.add(0, 5); // [ 5, 10 ]

        linkList.addAll(Arrays.asList(20, 30, 40)); // # addAll() -> To add multiple values together  [ 5, 10, 20, 30, 40 ]
        
        LinkedList<Integer> linkList2 = new LinkedList<>(Arrays.asList(50, 60, 70)); 
        linkList.addAll(linkList2); // # merge two linkedList together : [ 5, 10, 20, 30, 40, 50, 60, 70 ]

        // linkList.clear();
        linkList.contains(99); // false
        linkList.indexOf(5); // 0 index
        linkList.lastIndexOf(5); // Returns the index of last 5 in the linkList
    //  linkList.remove(0); --> remove value 5
        linkList.set(0, 6); // --> replace 5 with 6  [ 6, 10, 20, 30, 40, 50, 60, 70 ]

        // Printing linkedList
        for (Integer i : linkList) {
            System.out.print(i + ", ");
        }
    }
}
