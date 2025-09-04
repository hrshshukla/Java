public class Methods_String {
    public static void main(String[] args) {
        String name = "HARSH"; // another string with value "Harsh" will also refrence to same memory location
        String name2 = new String("Harsh"); // creates a new object everytime for same value "Harsh"

        String newName = name.toLowerCase(); // "HARSH" -> "harsh"

    }
}
