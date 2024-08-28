public class DecimalComparator {
    // write code here

    public static boolean areEqualByThreeDecimalPlaces(double firstParam, double secondParam){

        long firstParamInThreeDec = (long) (firstParam * 1000);
        long secondParamInThreeDec = (long) (secondParam * 1000);

        if (firstParamInThreeDec == secondParamInThreeDec) {
            return true;
        } else {
            return false;
        }

//  return firstRounded == secondRounded;

    }
}
