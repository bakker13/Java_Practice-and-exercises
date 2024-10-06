import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(5);
        System.out.println(Arrays.toString(firstArray));


        int[] sortedArray = sortIntegers(new int[] {7,30,35});
        System.out.println(Arrays.toString(sortedArray));



    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] rArray = new int[len];

        for (int i = 0; i < len; i++) {
            rArray[i] = random.nextInt(11);
        }

        return rArray;
    }

    private static int[] sortIntegers(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}
