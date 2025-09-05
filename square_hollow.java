import java.util.Scanner;

public class SquareHollow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();

        for (int r = 1; r <= side; r++) {
            for (int c = 1; c <= side; c++) {
                if (r == 1 || r == side || c == 1 || c == side) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*output:
6
******
*    *
*    *
*    *
*    *
******
 */
