public class FirstLastDigitSum {
    // write code here

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        // if (number == 0) {
        //     return 0;
        // }

        int lastDigit = number % 10;

        while (number >= 10) {
            number = number / 10;
        }

        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}
