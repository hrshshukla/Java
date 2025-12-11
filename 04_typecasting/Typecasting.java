public class Typecasting {
    public static void main(String[] args) {
        char password = 'a';

        password += 9; // encryption : add 9 to 'a' which is equals to adding 9 to 97
        System.out.println(password); // output : j

        password -= 9; // decryption : minus 9 to 'j' which is equals to adding 9 to 106
        System.out.println(password); // output : a
    }
}
