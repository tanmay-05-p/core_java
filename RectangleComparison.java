import java.util.Random;

class Rectangle {
    int length;
    int width;

    // Constructor to initialize length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public int calculateArea() {
        return length * width;
    }
}

public class RectangleComparison {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate random dimensions (1 to 20)
        Rectangle rect1 = new Rectangle(rand.nextInt(20) + 1, rand.nextInt(20) + 1);
        Rectangle rect2 = new Rectangle(rand.nextInt(20) + 1, rand.nextInt(20) + 1);

        int area1 = rect1.calculateArea();
        int area2 = rect2.calculateArea();

        // Display dimensions and areas
        System.out.println("Rectangle1: " + rect1.length + "x" + rect1.width + " = Area " + area1);
        System.out.println("Rectangle2: " + rect2.length + "x" + rect2.width + " = Area " + area2);

        // Compare using relational operators
        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}
