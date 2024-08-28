public class SpeedConverter {
    // write code here
    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0) {
            return -1;
        } else {        // 1 mile = kilometersPerHour * 1.609

            double kilometerToMiles = kilometersPerHour / 1.609;
            long roundedValue = Math.round(kilometerToMiles);
            return roundedValue;
        }
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(-2.0);
        printConversion(-25.0);
        printConversion(0.0);
        printConversion(2.0);
        printConversion(1.25);
        printConversion(100.4);
    }
}
