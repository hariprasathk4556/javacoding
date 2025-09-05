import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        // Top half including middle
        for (int row = size; row >= 1; row--) {
            // leading spaces
            for (int space = 0; space < size - row; space++) {
                System.out.print(" ");
            }
            // stars and gaps
            for (int col = 1; col <= (2 * row - 1); col++) {
                if (col == 1 || col == 2 * row - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Bottom half
        for (int row = 2; row <= size; row++) {
            // leading spaces
            for (int space = 0; space < size - row; space++) {
                System.out.print(" ");
            }
            // stars and gaps
            for (int col = 1; col <= (2 * row - 1); col++) {
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
5
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *
 */
