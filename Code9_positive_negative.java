import java.util.Scanner;
public class Q9_positive_negative{
   public static void main(String[]args) {
      Scanner src = new Scanner(System.in);
      int n = src.nextInt();
      if (n > 0) {
         System.out.println(n+" is positive");
      } else if (n < 0) {
         System.out.println(n+" is negative");
      } else {
         System.out.println(n+" is zero");
      }

   }
}
/*output:
    5
    5 is positive

    -8
    -8 is negative
    
    0
    0 is zero
 */
