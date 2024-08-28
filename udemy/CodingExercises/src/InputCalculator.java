import java.util.Scanner;

public class InputCalculator {
    // write code here

    public static void inputThenPrintSumAndAverage(){

        int counter = 0;
        int sum = 0;
        long avg = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean validInput = scanner.hasNextInt();

            if (!validInput) {
                break;
            }

            sum += scanner.nextInt();
            counter++;
            scanner.nextLine();

        }

        if (counter > 0) {
            avg = Math.round((double) sum / counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}