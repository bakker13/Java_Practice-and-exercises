public class BarkingDog {
    // write code here

    public static boolean shouldWakeUp(boolean barking, int hourDay) {


        if (hourDay < 0 || hourDay > 23) {
            return false;
        } else if ((hourDay >= 0 && hourDay < 8 || hourDay > 22 && hourDay <= 23) && barking == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(false, -5));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(false, 24));
        System.out.println(shouldWakeUp(true, 44));
        System.out.println(shouldWakeUp(false, 6));
        System.out.println(shouldWakeUp(true, 4));
        System.out.println( shouldWakeUp(true, 23));

    }
}
