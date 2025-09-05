import java.util.Scanner;

public class EmptyPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        for (int row = 1; row <= size; row++) {
            // spaces
            for (int sp = 1; sp <= size - row; sp++) {
                System.out.print(" ");
            }
            // stars and hollow part
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (row == size || col == 1 || col == 2 * row - 1)
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
    *
   * *
  *   *
 *     *
*********
 */
