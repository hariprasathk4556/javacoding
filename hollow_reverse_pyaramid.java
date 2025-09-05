import java.util.Scanner;

public class HollowReversePyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        for (int row = size; row >= 1; row--) {
            // spaces
            for (int sp = 1; sp <= size - row; sp++) {
                System.out.print(" ");
            }
            // hollow stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == size)
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
 */
