import java.util.Scanner;

public class W02_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read n numbers into array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];  // Assume first element is maximum
for (int i = 1; i < n; i++) {
    if (arr[i] > max) {
        max = arr[i];  // Update maximum if current element is larger
    }
}

/*
Explanation:
- Start with first element as assumed maximum
- Loop through remaining elements
- Update max whenever a larger number is found
- At the end, max holds the largest number
*/
System.out.println("Maximum is: " + max);

        sc.close();
    }
}