public class Problems {
    public static void main(String[] args) {
        // Question 1: replace "space" with "underscore"
        String name = "Harsh Shukla";
        System.out.println(name.replace(" ", "_")); // Harsh_Shukla

        // Question 2: Find if string contains double-space or triple-space
        String word = "wow   that'sawesome";
        if ((word.indexOf("  ") != -1)) {
            System.out.println("2 Spaces");
        }
        if((word.indexOf("   ") != -1)) {
            System.out.println("3 Spaces");
        }
        else {
            System.out.println("Not found");
        }
    }
}
