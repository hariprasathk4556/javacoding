import java.util.Scanner;
public class Q6_minmax {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int i=src.nextInt();
        int j=src.nextInt();
        if(i>j)
        System.out.print("max= "+i+" min= "+j);
        else
        System.out.print("max= "+j+" min= "+i);
    }
}
/*output:
    5 9
    max= 9 min= 5

    12 7
    max= 12 min= 7
 */
