import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();

        for (int r = 1; r <= side; r++) {
            for (int c = 1; c <= side; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*output:
    5
    *****
    *****
    *****
    *****
    *****
 */
