package Assignment1CSW_2;
import java.util.*;

class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    // Default constructor
    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "Unknown";
    }

    // Parameterized constructor
    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    // Setters
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    // Getters
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
}

class ImageLibrary {
    private ArrayList<Image> images;

    // Constructor
    public ImageLibrary() {
        images = new ArrayList<>();
    }

    // Insert an image
    public void insertImage(Image img) {
        images.add(img);
        System.out.println("Image inserted successfully.");
    }

    // Search an image by colorCode
    public Image searchImage(String colorCode) {
        for (Image img : images) {
            if (img.getColorCode().equalsIgnoreCase(colorCode)) {
                return img;
            }
        }
        return null;
    }

    // Get image by index
    public Image getImage(int index) {
        if (index >= 0 && index < images.size()) {
            return images.get(index);
        } else {
            return null;
        }
    }
}

public class ImageController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImageLibrary library = new ImageLibrary();

        // Insert some images
        library.insertImage(new Image(800, 600, "RGB"));
        library.insertImage(new Image(1920, 1080, "CMYK"));
        library.insertImage(new Image(1024, 768, "Grayscale"));

        // Search for an image
        System.out.print("Enter color code to search for an image: ");
        String colorCode = sc.nextLine();
        Image foundImage = library.searchImage(colorCode);
        if (foundImage != null) {
            System.out.println("Image found: " + foundImage);
        } else {
            System.out.println("Image with color code '" + colorCode + "' not found.");
        }

        // Get an image by index
        System.out.print("Enter index of image to retrieve: ");
        int index = sc.nextInt();
        Image retrievedImage = library.getImage(index);
        if (retrievedImage != null) {
            System.out.println("Image at index " + index + ": " + retrievedImage);
        } else {
            System.out.println("Invalid index!");
        }

        sc.close();
    }
}
