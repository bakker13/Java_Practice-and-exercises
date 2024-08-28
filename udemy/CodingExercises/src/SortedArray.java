import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    // write code here

    public static int[] getIntegers(int arrayLength) {

        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[arrayLength];

        System.out.println("Enter " + arrayLength + " integer values:\r");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        return inputArray;
    }

    public static void printArray(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] inputArray){
        int[] mySortedArray = Arrays.copyOf(inputArray, inputArray.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < mySortedArray.length - 1; i++) {
                if(mySortedArray[i] < mySortedArray[i + 1]) {
                    temp = mySortedArray[i];
                    mySortedArray[i] = mySortedArray[i+1];
                    mySortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(mySortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(mySortedArray));
        }

        return mySortedArray;
    }
}