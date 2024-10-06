public class SumOddRange {
    // write code here

    public static boolean isOdd (int number) {

        if (number < 0) {
            return false;
        }

        if (number % 2 != 0) {
            return true;
        }

        return false;
    }

    public static int sumOdd (int startingRange, int endingRange) {

        int sum = 0;

        if (startingRange > 0 && endingRange > 0 && startingRange <= endingRange) {
            for (int i = startingRange; i <= endingRange; i++) {
                if (isOdd(i)){
                    sum += i;
                }
            }
        } else {
            return -1;
        }
        return sum;
    }
}
