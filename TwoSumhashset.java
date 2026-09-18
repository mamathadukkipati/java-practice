
import java.util.HashSet;
import java.util.Scanner;

public class TwoSumhashset {

    static boolean is2Sum(int a[], int n, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            int s= target - a[i];

            if (set.contains(s)) {
                return true;
            }

            set.add(a[i]);
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

