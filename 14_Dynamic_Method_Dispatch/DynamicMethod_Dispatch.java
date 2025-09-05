// What is dynamic method dispatch : kis object ka konsa method call hoga ye cheej jab runtime me decide hoti hai then it is called dynamic method dispatch 
// Phone obj = new Smartphone(); ✅ Valid
// Smartphone obj = new Phone(); ❌ Not Valid

class Phone{
    void activate(){
        System.out.println("Phone activated!");
    }
}

class Smartphone extends Phone{
    @Override
    void activate(){
        System.out.println("Smartphone activated!!");
    }

    public void music() {
        System.out.println("Playing music...");
    }

}

public class DynamicMethod_Dispatch {
    public static void main(String[] args) {

    // Case (1) : reference of "base" (Phone) but object of "derived" (Smartphone)
        Phone obj = new Smartphone(); 

        obj.activate(); // Smartphone activated!! ✅
     // obj.music(); // ❌ Not Valid bcoz --> reference of "base" (Phone) but, object of "derived" (Smartphone)

    
    // Case (2) : reference and object of same class 
        Smartphone obj2 = new Smartphone();

        obj2.music(); // ✅ Valid bcoz --> reference == base 

    }
}
