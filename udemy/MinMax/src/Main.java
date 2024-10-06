import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int loopCounter = 0;

        while (true) {
            System.out.println("Please enter a number, or any character to exit: ");
            String userInput = scanner.nextLine();

            try {
                int myInput = Integer.parseInt(userInput);

                if (myInput < min || loopCounter == 0) {
                    min = myInput;
                } else if (myInput > max || loopCounter == 0) {
                    max = myInput;
                }

                loopCounter++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        if (loopCounter > 0) {
            System.out.println("The minimum number is " + min +
                    " the maximum number is " + max + " from " + loopCounter +
                    " user number.");
        } else {
            System.out.println("No valid data was given.");
        }
    }
}
