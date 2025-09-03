import java.util.Scanner;

public class W02_P4 {

    // Declare a class named Rectangle
    static class Rectangle {
        int length;
        int width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length and width
        int l = sc.nextInt();
        int w = sc.nextInt();

        // Create an object of the Rectangle class
        Rectangle rect = new Rectangle();

        // Assign values to the object's member variables
        rect.length = l;
        rect.width = w;
System.out.println("Sum of length and width is: " + (rect.length + rect.width)); // Print sum using object members
sc.close();
    }
}