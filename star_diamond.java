import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        // upper half
        for (int r = 1; r <= size; r++) {
            for (int sp = 1; sp <= size - r; sp++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * r - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int r = size - 1; r >= 1; r--) {
            for (int sp = 1; sp <= size - r; sp++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * r - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
