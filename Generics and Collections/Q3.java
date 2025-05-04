package cswassignTWO;

class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car [Model=" + model + ", Color=" + color + ", Speed=" + speed + " km/h]";
    }

    @Override
    public int compareTo(Car ob) {
        return Integer.compare(this.speed, ob.speed);
    }
}

public class Q3 {
    public static void main(String[] args) {
       
        Car car1 = new Car("Fortuner", "White", 150);
        Car car2 = new Car("Lamborghini Huracan", "Yellow", 320);

        int comparison = car1.compareTo(car2);

        if (comparison > 0) {
            System.out.println(car1.getModel() + " is faster.");
            System.out.println("\nDetails of the faster car:");
            System.out.println(car1);
        } else if (comparison < 0) {
            System.out.println(car2.getModel() + " is faster.");
            System.out.println("\nDetails of the faster car:");
            System.out.println(car2);
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}
