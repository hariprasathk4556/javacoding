import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();

        for (int r = 1; r <= height; r++) {
            for (int s = 1; s <= height - r; s++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * r - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*output:
6
     *
    ***
   *****
  *******
 *********
***********
 */
