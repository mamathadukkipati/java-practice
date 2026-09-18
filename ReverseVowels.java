public class ReverseVowels {

    public static void main(String[] args) {

        String str = "pandu";

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

           
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }

    public static boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}