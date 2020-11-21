package HomeWork3;

import java.util.Scanner;
import java.util.Arrays;

class HomeWorkv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {3, 2, 4, 7, 5};
        System.out.println("Source array: " + Arrays.toString(arr));
        System.out.println("Array to Number: " + arrayToNumber(arr));
        System.out.println("");
        System.out.println("Sum array elements = " + arraySum(arr));
        System.out.println("");
        arrayReverse(scanner);
        System.out.println("");
        arrayMean(scanner);
        System.out.println("");
        System.out.println("Reverse MinMax: " + Arrays.toString(reverseMinMax(arr)));
        System.out.println("");
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSort(arr)));
        System.out.println("");
        System.out.println("Array to Number: " + arrayToNumber(arr));
    }

    public static int arraySum(int array[]) {
        int arsum = 0;
        for (int i = 0; i < array.length; i++) {
            arsum += array[i];
        }
        return arsum;
    }

    public static void arrayReverse(Scanner scanner) {
        System.out.print("Enter count of number: ");

        int count = scanner.nextInt();
        int array[] = new int[count];
        int swap = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("");
        System.out.println("Yours array:   " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            swap = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = swap;
        }

        System.out.println("Reverse array: " + Arrays.toString(array));
    }

    public static void arrayMean(Scanner scanner) {

        System.out.print("Enter count of number: ");

        int count = scanner.nextInt();
        int array[] = new int[count];
        int arMean = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number: ");
            array[i] = scanner.nextInt();
        }

        arMean = arraySum(array) / array.length;

        System.out.println("");
        System.out.println("Yours array: " + Arrays.toString(array));
        System.out.println("");
        System.out.println("Arithmetic Mean of array = " + arMean);
    }

    public static int[] reverseMinMax(int array[]) {

        int result[] = array;
        int i_max = 0;
        int i_min = 0;

        for (int i = 1; i < result.length; i++) {
            if (array[i_max] < result[i]) {
                i_max = i;
            }
            if (array[i_min] > result[i]) {
                i_min = i;
            }
        }

        int swap = array[i_max];
        array[i_max] = array[i_min];
        array[i_min] = swap;

        return array;
    }

    public static int[] bubbleSort(int[] array) {
        int result[] = array;
        int temp = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j + 1] < result[j]) {
                    temp = array[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }

    public static int arrayToNumber(int array[]) {
        int num = 0;
        num = array[0];
        for (int i = 1; i < array.length; i++) {
            num = num * 10 + array[i];
        }
        return num;
    }
}