// WAP to demonstrate how we can create objects inside the same class.

package src.com.mkpits.java.practiceprogram;

public class CreateObjectInsideClass {
    // store the value for light, true if light is on else false
    boolean isOn;

    // Method to turn on the light
    void turnOn(){
        isOn = true;
        System.out.println("Light On" + isOn);
    }
    void turnOff(){
        isOn = false;
        System.out.println("Light Off" + isOn);
    }
    public static void main(String[] args){
        CreateObjectInsideClass led = new CreateObjectInsideClass();
        led.turnOn();
        led.turnOff();
    }
    }
