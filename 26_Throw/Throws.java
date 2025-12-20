class LessThanZeroException extends Exception {
    @Override
    public String toString() {
        return "value cannnot be equals to or smaller than ZERO";
    }
    
    @Override
    public String getMessage() {
        return "value cannnot be equals to or smaller than ZERO";
    }
}

public class Throws {

    public static int divide(int num1, int num2 )throws LessThanZeroException {

        if (num2 <= 0) {
            throw new LessThanZeroException();
        }

        return num1/num2;
    }
    public static void main(String[] args) {
        
        try {
            int c = divide(6, 0);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
