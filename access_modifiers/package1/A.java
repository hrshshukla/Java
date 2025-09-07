package package1;

public class A {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;   // no modifier (package-private)
    private int privateVar = 40;

    public void showAccessInClass() {
        System.out.println("Inside class A:");
        System.out.println("publicVar    = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar  = " + defaultVar);
        System.out.println("privateVar  = " + privateVar); // ✅ accessible in same class
    }
}
