package package2;

import package1.A;

class SubClass extends A {
    void showAccessInSubclass() {
        System.out.println("Inside SubClass (extends A, different package):");
        System.out.println("publicVar    = " + publicVar);     // ✅ allowed
        System.out.println("protectedVar = " + protectedVar);  // ✅ allowed (because subclass)
        // System.out.println("defaultVar  = " + defaultVar);   // ❌ not allowed (different package)
        // System.out.println("privateVar  = " + privateVar);   // ❌ not allowed
    }
}

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.showAccessInClass();

        System.out.println("\nInside B (different package, non-subclass):");
        System.out.println("publicVar    = " + obj.publicVar); // ✅ allowed
        // System.out.println("protectedVar = " + obj.protectedVar); // ❌ not allowed (not subclass)
        // System.out.println("defaultVar  = " + obj.defaultVar);    // ❌ not allowed
        // System.out.println("privateVar  = " + obj.privateVar);    // ❌ not allowed

        System.out.println();
        SubClass sub = new SubClass();
        sub.showAccessInSubclass();
    }
}
