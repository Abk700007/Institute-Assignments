package Assignment1CSW_2;//Q3
public class Point {
    private double x;
    private double y;

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }

    // Main method
    public static void main(String[] args) {
        // Create original point
        Point p1 = new Point(3.5, 4.6);

        // Create copy of p1
        Point p2 = new Point(p1);

        // Display initial values
        System.out.println("Original Point p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Copied Point p2: (" + p2.getX() + ", " + p2.getY() + ")");

        // Modify p1
        p2.setX(5.6);
        p2.setY(6.5);

        // Display values after modification
        System.out.println("\nAfter modifying p2:");
        System.out.println("Original Point p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Copied Point p2: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
