import java.util.Scanner;

public class PascalRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        // upper half
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int r = rows - 1; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
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
