package Assignment1CSW_2;

class Ca {
    private String make;
    private String model;

    // Parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }
}
public class CarTesterQ1 {
    public static void main(String[] args) {
        // Create myCar1 with values
        Car myCar1 = new Car("Toyota", "Corolla");

        // Create myCar2 with null values 
        Car myCar2 = new Car(null, null);

        // Print initial details
        System.out.println("Initial details:");
        System.out.println("myCar1 - Make: " + myCar1.getMake() + ", Model: " + myCar1.getModel());
        System.out.println("myCar2 - Make: " + myCar2.getMake() + ", Model: " + myCar2.getModel());

        // Update myCar2 using setters
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        // Print updated details
        System.out.println("\nUpdated details:");
        System.out.println("myCar2 - Make: " + myCar2.getMake() + ", Model: " + myCar2.getModel());
    }
}
