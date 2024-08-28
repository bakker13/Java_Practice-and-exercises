public class Main {

    public static void main(String[] args) {

        int number = 5;
        int evenCounter = 0;
        int oddCounter = 0;

        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println("Even number: " + number);
                evenCounter++;
            } else if (!isEvenNumber(number)) {
//                System.out.println("Odd number " + number);
                oddCounter++;
            }
            number++;

            if (evenCounter == 5) {     // vagy >= 5
                System.out.println("The total number of even numbers: " + evenCounter);
                System.out.println("The total number of odd numbers: " + oddCounter);
                break;
            }
        }
    }

    public static boolean isEvenNumber (int number) {
        return number % 2 == 0;
    }
}

/* or:

int number = 4;
int finishNumber = 20;

while (number <= finishNumber) {
    number++;
    if (!isEvenNumber(number)) {
        continue;
        }
        System.out.println("Even number " + number);
 */
