
public class Var_Args {
    static int sumAll(int ...arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println(sumAll(2,3,4,5));
    }
}
