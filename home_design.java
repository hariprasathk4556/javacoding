import java.util.Scanner;

public class HomeDesign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();  // height of the roof

        // Roof part (pyramid)
        for (int r = 1; r <= h; r++) {
            // spaces
            for (int s = 1; s <= h - r; s++) {
                System.out.print(" ");
            }
            // stars
            for (int star = 1; star <= 2 * r - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Body part (rectangle)
        for (int b = 1; b <= h - 2; b++) {
            // left wall
            System.out.print("*");
            // gap
            for (int g = 1; g <= (2 * h - 1) - 6; g++) {
                System.out.print(" ");
            }
            // right wall
            System.out.println("*");
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
***     ***
***     ***
***     ***
***     ***
 */
