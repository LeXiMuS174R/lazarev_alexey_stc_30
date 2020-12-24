package HomeWork22;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int sum = 0;


        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);
        System.out.println();


        int threadCount = Thread.activeCount();
        ThreadService threadService = new ThreadService();

        threadService.submit(() -> {
            int firstThreadSum = 0;
            for (int i = 0; i < 5; i++) {
                firstThreadSum = firstThreadSum + array[i];
            }
            threadService.sum += firstThreadSum;

            System.out.println(Thread.currentThread().getName() + " from 0 to 4 sum is " + firstThreadSum);
        });

        threadService.submit(() -> {
            int secondThreadSum = 0;
            for (int i = 5; i < 10; i++) {
                secondThreadSum = secondThreadSum + array[i];
            }
            threadService.sum += secondThreadSum;
            System.out.println(Thread.currentThread().getName() + " from 5 to 9 sum is " + secondThreadSum);
        });

        threadService.submit(() -> {
            int thirdThreadSum = 0;
            for (int i = 10; i < array.length; i++) {
                thirdThreadSum = thirdThreadSum + array[i];
            }
            threadService.sum += thirdThreadSum;
            System.out.println(Thread.currentThread().getName() + " from 10 to 12 sum is " + thirdThreadSum);
        });

        while (true) {
            if (Thread.activeCount() <= threadCount) break;
        }

        System.out.println();
        System.out.println("Sum by threads: " + threadService.sum);
    }
}
