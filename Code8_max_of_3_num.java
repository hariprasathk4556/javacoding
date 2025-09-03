import java.util.Scanner;

public class Q_Max_of_3_Num {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int i = src.nextInt();
        int j = src.nextInt();
        int k = src.nextInt();

        if (i >= j && i >= k) {
            System.out.println(i);
        } else if (j >= i && j >= k) {
            System.out.println(j);
        } else {
            System.out.println(k);
        }
    }
}
/*output:
    5 7 3
    7

    12 45 23
    45
 */
