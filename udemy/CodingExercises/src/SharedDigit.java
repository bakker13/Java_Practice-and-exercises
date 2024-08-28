public class SharedDigit {
    // write code here

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if (firstNumber < 10 || secondNumber < 10 || firstNumber > 99 || secondNumber > 99) {
            return false;
        }

        int testFirst = firstNumber;

        while (testFirst != 0) {
            int testSecond = secondNumber;
            while (testSecond != 0) {
                if ((testFirst % 10) == (testSecond % 10)) {
                    return true;
                }
                testSecond /= 10;
            }
            testFirst /= 10;
        }
        return false;
    }
}
