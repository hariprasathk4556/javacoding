import java.util.Scanner;

public class LeftTriangleHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int r = 1; r <= height; r++) {
            for (int c = 1; c <= r; c++) {
                if (r == height || c == 1 || r == c) {
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
7
*
**
* *
*  *
*   *
*    *
*******
 */
