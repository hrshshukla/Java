import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> myHashSet = new HashSet<>(10, 0.5f); // initial : capacity -> 16, loadfactor -> 0.75  
        
        myHashSet.add(10); // [ 10 ]
        myHashSet.add(20); // [ 10, 20]
        myHashSet.add(10); // [ 10, 20]  ignores duplicate value

        
    }
}
