import java.util.Scanner;
import java.util.Arrays;

class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you need to add?");

        int asize = scanner.nextInt();
        int array[] = new int[asize];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number: ");
            array[i] = scanner.nextInt();
        }

        //Вывод в зеркальном представлении
        System.out.println("Array in mirror: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        //Вывод в не зеркальном представлении
        System.out.println("");
        System.out.println(Arrays.toString(array));
    }
}
