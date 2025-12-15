// refrence of interface and object of class 

interface Camera {
    void clickPhoto();
    void recordVideo();

}

interface Music {
    void playMusic();
    void stopMusic();
}

class SmartPhone implements Camera, Music{

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


public class polymorphism {
    public static void main(String[] args) {

        // without polymorphism
        SmartPhone mySmartPhone1 = new SmartPhone(); // All mehtods are accessible

        // with polymorphism
        Camera mySmartPhone = new SmartPhone(); // only clickPhoto() & recordVideo() is accessible now 

        mySmartPhone.clickPhoto(); // --> ✅ Valid
        mySmartPhone.recordVideo(); // --> ✅ Valid

        // mySmartPhone.playMusic(); --> ❌ Invalid
    }
    
}

