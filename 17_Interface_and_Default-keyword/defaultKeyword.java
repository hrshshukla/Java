// Concept (1) --> what is default keyword and why to use them 
// We know that : All the methods inside a interface are abstract methods and need to be defined in the child class
// But with the help of "default" keyword we can define the method directly inside the interface And,
// The child classes are not forced to define or override them. 

// Concept (2) --> Multilevel inheritance in java is possible ??
// We know that : we cannot use multiple classes to create one class, but we can use multiple interfaces in one class 


interface Camera {
// (1) Abstract Methods
    void clickPhoto();
    void recordVideo();

// (2) "default" methods
    default void recordVideo_4k(){
        System.out.println("Recording in 4k....");
    }
}

interface Music {
    void playMusic();
    void stopMusic();
}

// Multiple inheritance
class SmartPhone implements Camera, Music{

// Default method : optional to override
    @Override
    public void recordVideo_4k() {
        System.out.println("Updated 4k recording...");
    }

    @Override
    public void clickPhoto() {
        System.out.println("Clicking the photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped...");
    }

}


public class defaultKeyword {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone();
        mySmartPhone.recordVideo_4k();
    }
    
}
