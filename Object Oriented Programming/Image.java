package Assignment1CSW_2;
public class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    // Default constructor
    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "None";
    }

    // Parameterized constructor
    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    // Setter methods
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    // Getter methods
    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public String getColorCode() {
        return colorCode;
    }

    // toString method
    public String toString() {
        return "Image [Width=" + imageWidth + ", Height=" + imageHeight + ", ColorCode=" + colorCode + "]";
    }

    // Main method
    public static void main(String[] args) {
        // Creating object using default constructor
        Image img1 = new Image();
        System.out.println("Details of img1:");
        System.out.println(img1);

        // Creating object using parameterized constructor
        Image img2 = new Image(1920, 1080, "RGB");
        System.out.println("\nDetails of img2:");
        System.out.println(img2);
    }
}

