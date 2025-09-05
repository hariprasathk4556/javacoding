import java.util.Scanner;

public class TriangleRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        for (int r = 1; r <= size; r++) {
            for (int sp = 1; sp <= size - r; sp++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= r; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*output:
5
    *
   **
  ***
 ****
*****
 */
