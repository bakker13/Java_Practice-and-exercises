public class FlourPacker {
    // write code here

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;

        if ((bigCount * 5) >= goal) {
            int remainWeight = goal % 5;
            if (smallCount >= remainWeight){
                result = true;
            }
        } else {
            if (smallCount >= (goal - (bigCount * 5))) {
                result = true;
            }
        }

        return result;
    }
}
