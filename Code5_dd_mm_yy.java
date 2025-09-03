import java.util.Scanner;

public class Q4_dd_mm_yy{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the days: ");
        int i = scr.nextInt();

        int year, rdays, month, days;
        year = i / 365;     
        rdays = i % 365;     
        month = rdays / 30;      
        days = rdays % 30;      

        System.out.println("Years: " + year);
        System.out.println("Months: " + month);
        System.out.println("Days: " + days);
    }
}
/*output:
    Enter the days: 400
    Years: 1
    Months: 1
    Days: 5
 */
