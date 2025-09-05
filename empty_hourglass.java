import java.util.Scanner;

public class EmptyHourglass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        // top hollow inverted triangle
        for (int row = size; row >= 1; row--) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == size || row == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // bottom hollow triangle
        for (int row = 2; row <= size; row++) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == size || row == 1)
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
*********
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*********
 */
