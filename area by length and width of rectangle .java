import java.util.Scanner;

public class W02_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length and width of the rectangle
        int length = sc.nextInt();
        int width = sc.nextInt();
int area = length * width; // Multiply length and width to get the area
// Print the area
        System.out.print("Area is: " + area);

        sc.close();
    }
}