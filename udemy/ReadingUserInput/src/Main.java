import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
//        int sum = 0;
        double sum = 0;

//        while (counter <= 5) {
        do {
            System.out.println("Enter number #" + counter + ": ");
            String givenNumber = scanner.nextLine();
            try {
//                int number = Integer.parseInt(givenNumber);
                double number = Double.parseDouble(givenNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        System.out.println("The sum of the 5 given number is= " + sum);
    }
}