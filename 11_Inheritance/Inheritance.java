class Human {

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Male extends Human{

}
public class Inheritance {
    public static void main(String[] args) {
        Male harsh = new Male();
        harsh.setX(12);
        System.out.println(harsh.getX());
    }
}
