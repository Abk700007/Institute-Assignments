package Assignment1CSW_2;
//Interface Vehicle
interface Vehicle {
 void accelerate();
 void brake();
}

//Car class implementing Vehicle
class Car implements Vehicle {

 // Overriding accelerate() and brake()
 public void accelerate() {
     System.out.println("Car is accelerating smoothly.");
 }

 public void brake() {
     System.out.println("Car is braking with ABS system.");
 }

 // Method overloading: accelerate with speed
 public void accelerate(int speed) {
     System.out.println("Car is accelerating to " + speed + " km/h.");
 }

 // Method overloading: accelerate with speed and duration
 public void accelerate(int speed, int duration) {
     System.out.println("Car is accelerating to " + speed + " km/h in " + duration + " seconds.");
 }
}

//Bicycle class implementing Vehicle
class Bicycle implements Vehicle {

 // Overriding accelerate() and brake()
 public void accelerate() {
     System.out.println("Bicycle is pedaling faster.");
 }

 public void brake() {
     System.out.println("Bicycle is applying hand brakes.");
 }

 // Method overloading: accelerate with speed
 public void accelerate(int speed) {
     System.out.println("Bicycle is accelerating to " + speed + " km/h.");
 }

 // Method overloading: accelerate with speed and duration
 public void accelerate(int speed, int duration) {
     System.out.println("Bicycle is accelerating to " + speed + " km/h in " + duration + " seconds.");
 }
}

//VehicleApp class with main method
public class VehicleApp {
 public static void main(String[] args) {
     // Create Car and Bicycle objects
     Car car = new Car();
     Bicycle bicycle = new Bicycle();

     // Test overridden methods
     System.out.println("Testing Car:");
     car.accelerate();
     car.brake();

     // Test overloaded methods
     car.accelerate(100);
     car.accelerate(120, 10);

     System.out.println("\nTesting Bicycle:");
     bicycle.accelerate();
     bicycle.brake();

     // Test overloaded methods
     bicycle.accelerate(20);
     bicycle.accelerate(25, 5);
 }
}
