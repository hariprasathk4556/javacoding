import java.util.Scanner;

public class SlantedSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        for (int row = size; row >= 1; row--) {
            // spaces
            for (int sp = 1; sp <= size - row; sp++) {
                System.out.print(" ");
            }
            // stars
            for (int col = 1; col <= size; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*output:
4
****
 ****
  ****
   ****
 */
