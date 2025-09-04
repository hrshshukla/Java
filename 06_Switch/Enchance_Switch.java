public class Enchance_Switch {
    public static void main(String[] args) {
        int age = 19;

        // Normal switch
        switch (age){
            case 18:
                System.out.println("You're now adult");
                System.out.println("You're start enjoying");
                break;
            case 50:
                System.out.println("Need to retire");
                break;
            default:
                System.out.println("You're Immortal");
        }

        // enhance switch
        switch (age) {
            case 18 -> {
                System.out.println("You're now adult");
                System.out.println("You're start enjoying");
            }
            case 50 -> System.out.println("Need to retire");
            default -> System.out.println("You're Immortal");
        }
    }
}
