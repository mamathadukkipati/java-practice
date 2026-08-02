import java.util.Scanner;

public class perfect Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int x = (int) Math.sqrt(n);

        if (x * x == n)
            System.out.println(n + " is a Perfect Square");
        else
            System.out.println(n + " is Not a Perfect Square");

        sc.close();
    }
}