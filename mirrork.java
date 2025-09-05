import java.util.Scanner;

public class MirrorK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        // Upper part
        for (int row = size; row >= 1; row--) {
            // leading spaces
            for (int sp = 0; sp < size - row; sp++) {
                System.out.print(" ");
            }
            // stars
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (int row = 2; row <= size; row++) {
            // spaces
            for (int sp = 0; sp < size - row; sp++) {
                System.out.print(" ");
            }
            // stars
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*output:
5
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****
 */
