// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;
class Q1_EvenOdd {
   public static void main(String[]args) {
      Scanner src = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = src.nextInt();
      if (n % 2 == 0) {
         System.out.println("Even");
      } else {
         System.out.println("Odd");
      }

   }
}
/*output:
    Enter a number: 4
    Even

    Enter a number: 7
    Odd
 */