import java.util.Scanner;

public class DiamondHollow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        // upper half
        for (int row = 1; row <= size; row++) {
            for (int sp = 1; sp <= size - row; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // lower half
        for (int row = size - 1; row >= 1; row--) {
            for (int sp = 1; sp <= size - row; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*output:
4
   *
  * *
 *   *
*     *
 *   *
  * *
   *
 */
