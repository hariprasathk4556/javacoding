import java.util.Scanner;
public class Q3_3and5 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("enter the value:");
    int n=scr.nextInt();
    if(n%3==0 && n%5==0)
    System.out.println("yes");
    else 
    System.out.println("no");
    }
}
/*output:
    enter the value:15
    yes
    
    enter the value:7
    no
 */
