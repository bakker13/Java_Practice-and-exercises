public class NumberPalindrome {
    // write code here

    public static boolean isPalindrome(int number) {

        int reverseNumber = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            reverseNumber = reverseNumber * 10 + originalNumber % 10;
            originalNumber = originalNumber / 10;   //original /= 10;
        }

        return reverseNumber == number;
    }
}
