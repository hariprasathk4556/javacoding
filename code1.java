import java.util.Scanner;
public class Q10_Card_Eligibility {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int prime = src.nextInt();  
        int addon = src.nextInt();
        int code = src.nextInt();    
        int income = src.nextInt();  
        if (prime >= 21 && prime <= 60 && addon >= 18 && code >= 1 && code <= 4 && income <= 300000) {
            System.out.println("Yes. You are eligible for SBI credit cards");
        } else {
            System.out.println("No. You are not eligible for SBI credit cards");
        }
    }
}
/*output:
    45
    20
    2
    300000
    Yes. You are eligible for SBI credit cards

    45
    15
    2
    300000
    No. You are not eligible for SBI credit cards
 */
