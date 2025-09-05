import java.util.Scanner;

public class TriangleLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        for (int r = 1; r <= rows; r++) {
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
 */
