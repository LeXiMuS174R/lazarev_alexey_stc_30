package HomeWork2;

import java.util.Scanner;
import java.util.Arrays;

class HomeWork4 {
    public static void main(String[] args) {

        System.out.println("Enter count of number ");
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] array = new int[count];

        int i;
        int checkEqual;
        int swap;
        int high = 0;
        int low = 0;
        boolean isNotEqual = false;

        for (i = 0; i < count; i++) {
            System.out.println("Enter array element numbered " + i);
            array[i] = scanner.nextInt();
        }
        for (i = 0; i < (count - 1); i++) {
            checkEqual = array[i];
            for (i = 1; i < count; i++) {
                if (checkEqual == array[i]) {
                    System.out.println("All elements must be different");
                    isNotEqual = true;
                }
            }
        }
        if (isNotEqual == false) {
            int min = array[0];
            int max = array[0];
            for (i = 0; i < count; i++) {
                if (array[i] < min) {
                    min = array[i];
                    low = low + 1;
                }
            }
            for (i = 0; i < count; i++) {
                if (array[i] > max) {
                    max = array[i];
                    high = high + 1;
                }
            }

            System.out.println("Maximum array element = " + max);
            System.out.println("Minimum array element = " + min);

            System.out.println(Arrays.toString(array));

            //Swap
            swap = array[low];
            array[low] = array[high];
            array[high] = swap;

            System.out.println(" ");
            System.out.println(Arrays.toString(array));
        }
    }
}