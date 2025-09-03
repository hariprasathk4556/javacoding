import java.util.Scanner;
class Q5_mileage_remuneration {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("Enter beginning odometer reading: ");
        float begin=src.nextFloat();
        System.out.print("Enter ending odometer reading: ");
        float end=src.nextFloat();
        float dist=end-begin;
        float amount=Math.round(dist*25);
        System.out.printf("You traveled %.2f miles.At Rs.25 per mile, your remuneration is Rs.%.2f",dist,amount);
    }
}
/*output:
   Enter beginning odometer reading: 13505.2
    Enter ending odometer reading: 13810.6
    You traveled 305.40 miles.At Rs.25 per mile, your remuneration is Rs.7635.00 
 */
