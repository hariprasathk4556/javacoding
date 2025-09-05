import java.util.Scanner;

public class WingPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        // upper half
        for (int row = 1; row <= size; row++) {
            for (int left = 1; left <= row; left++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 * (size - row); space++) {
                System.out.print(" ");
            }
            for (int right = 1; right <= row; right++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int row = size - 1; row >= 1; row--) {
            for (int left = 1; left <= row; left++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 * (size - row); space++) {
                System.out.print(" ");
            }
            for (int right = 1; right <= row; right++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*output:
5
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */
