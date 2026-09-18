import java.util.Scanner;

public class ReverseOnlyLetters {

    static String reverseOnlyLetters(String s) {

        char[] a = s.toCharArray();

        int l = 0;
        int r = a.length - 1;

        while (l < r) {

   
            if (!Character.isLetter(a[l])) {
                l++;
            }

            else if (!Character.isLetter(a[r])) {
                r--;
            }

            else {
                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;

                l++;
                r--;
            }
        }

        return new String(a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(reverseOnlyLetters(s));
    }
}