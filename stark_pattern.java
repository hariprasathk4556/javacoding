import java.util.Scanner;

public class StarKPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        // Upper half
        for (int row = size; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int row = 2; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*output:
4
****
***
**
*
**
***
****
 */
