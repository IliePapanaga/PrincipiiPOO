import java.util.Scanner;
public class Car {
    public short wheels;
    public short doors;
    public int power;
    private int serviceneeded; // Add this line to declare serviceneeded

    public Car(int power, short wheels, short doors) {
        this.wheels = wheels;
        this.doors = doors;
        this.power = power;
        this.serviceneeded = 0; // Initialize serviceneeded
    }

    public Car() {
    }

    public void TirePressure(int decrement) {
        serviceneeded += decrement;
    }

    public void NewTires(int increment) {
        serviceneeded -= increment;
    }

    public String toString() {
        return "Power =" + this.power + "\tDoors =" + this.doors + "\tWheels =" + this.wheels;
    }
}
//Error: Main method not found in class Car, please define the main method as:
//   public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application