public class TeenNumberChecker {
    // write code here

    public static boolean hasTeen(int first, int second, int third) {
        if(first >= 13 && first <= 19) {
            return true;
        } else if (second >= 13 && second <= 19){
            return true;
        } else if (third >= 13 && third <= 19) {
            return true;
        } else {
            return false;
        }
        // public static boolean hasTeen(int a, int b, int c)
        //         return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int teenOrNot) {
        return teenOrNot >= 13 && teenOrNot <= 19;
        // return number > 12 && number < 20;
    }
}
