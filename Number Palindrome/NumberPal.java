public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(131));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (number != 0) {
            int lastDigit = number % 10;
            number = number / 10;
            reverse = (reverse * 10);
            reverse = reverse + lastDigit;
            continue;
        }

        if(num == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
