import java.util.Scanner;

public class PascalLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        // upper half
        for (int row = 1; row <= size; row++) {
            for (int sp = 1; sp <= size - row; sp++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int row = size - 1; row >= 1; row--) {
            for (int sp = 1; sp <= size - row; sp++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
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
 ****
  ***
   **
    *
 */
