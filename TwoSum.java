import java.util.Scanner;
import java.util.Arrays;

public class TwoSum {

    static boolean is2Sum(int a[], int n, int target) {
        Arrays.sort(a);

        int l = 0, r = n - 1;

        while (l < r) {
            int s = a[l] + a[r];

            if (s == target)
                return true;
            else if (s < target)
                l++;
            else
                r--;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean result = is2Sum(a, n, target);

        System.out.println("Result: " + result);

        sc.close();
    }
}