public class LastDigit {
    // write code here

    public static boolean hasSameLastDigit (int first, int second, int third) {

        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }

        int lastDigitFirst = first % 10;
        int lastDigitSecond = second % 10;
        int lastDigitThird = third % 10;

        return (lastDigitFirst == lastDigitSecond) || (lastDigitFirst == lastDigitThird) || (lastDigitSecond == lastDigitThird);

    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
