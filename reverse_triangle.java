import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        for (int row = size; row >= 1; row--) {
            for (int sp = 1; sp <= size - row; sp++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*output:
5
*********
 *******
  *****
   ***
    *
 */
