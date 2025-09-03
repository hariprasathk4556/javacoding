import java.util.Scanner;
class Q10_customer_grouping{
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=src.nextInt();
        System.out.println("male:1");
        System.out.println("female:2");
        System.out.print("Enter your Gender Code: ");
        int gen=src.nextInt();
        if(gen==1){
            if(age>0 && age<25)
            System.out.print("group 1");
            else if(age>=25 && age<45)
            System.out.print("group 3");
            else 
            System.out.print("group 5");
        }
        else if(gen==2){
        if(age>0 && age<25)
            System.out.print("group 2");
            else if(age>=25 && age<45)
            System.out.print("group 4");
            else 
            System.out.print("group 5");
        }
        else
        System.out.print("invalid code.");
    }
}
/*output:
    Enter your age: 23
    male:1
    female:2
    Enter your Gender Code: 1
    group 1
 */
