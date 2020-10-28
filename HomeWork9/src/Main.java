import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] lines = {"Morn1ing", "Bett7er", "Getter", "2g0o"};
        int[] numbers = {2547, 154921, 43085, 11104, 3493, 15206, 220840, 52108, 9028520};

        NumbersProcess reverseProcess = number -> {
            int value = number;
            int[] nums = numToArr(value);
            for (int i = 0; i < nums.length / 2; i++) {
                value = nums[i];
                nums[i] = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = value;
            }
            return arrToNum(nums);
        };

        NumbersProcess deleteZero = number -> {
            int value = number;
            int[] nums = numToArr(value);
            int count = nums.length;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    for (int j = i; j < count - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    count--;
                }
            }
            nums = Arrays.copyOf(nums, count);
            return arrToNum(nums);
        };

        NumbersProcess notEvenToEven = number -> {
            int value = number;
            int[] nums = numToArr(value);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 != 0) {
                    nums[i] = nums[i] - 1;
                }
            }
            return arrToNum(nums);
        };

        StringsProcess reverseString = input -> {
            char[] str = input.toCharArray();
            char value;
            for (int i = 0; i < str.length / 2; i++) {
                value = str[i];
                str[i] = str[str.length - i - 1];
                str[str.length - i - 1] = value;
            }
            return String.valueOf(str);
        };

        //НЕ РАБОТАЕТ :(
        StringsProcess deleteNums = input -> {
            char[] str = input.toCharArray();
            int count = str.length;
            for (int i = 0; i < str.length; i++) {
                if (Character.isDigit(str[i])) {
                    for (int j = i; j < count - 1; j++) {
                        str[j] = str[j + 1];
                        i--;
                    }
                    count--;
                }
            }
            return String.valueOf(str, 0, count);
        };


        StringsProcess toUpperCase = input -> {
            String output = input.toUpperCase();
            return output;
        };

        NumbersAndStringProcessor numbersAndStringProcessor = new NumbersAndStringProcessor(lines, numbers);

        int[] val = numbersAndStringProcessor.numProcess((reverseProcess));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(val));

        val = numbersAndStringProcessor.numProcess((deleteZero));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(val));

        val = numbersAndStringProcessor.numProcess((notEvenToEven));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(val));

        String[] str = numbersAndStringProcessor.strProcess((reverseString));
        System.out.println(Arrays.toString(lines));
        System.out.println(Arrays.toString(str));

        str = numbersAndStringProcessor.strProcess((deleteNums));
        System.out.println(Arrays.toString(lines));
        System.out.println(Arrays.toString(str));

        str = numbersAndStringProcessor.strProcess((toUpperCase));
        System.out.println(Arrays.toString(lines));
        System.out.println(Arrays.toString(str));
    }

    private static int[] numToArr(int num) {
        int value = num;
        int count = 0;
        int[] result;
        do {
            value = value / 10;
            count++;
        } while (value / 10 != 0 || value % 10 != 0);
        result = new int[count];
        value = num;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = value % 10;
            value = value / 10;
        }
        return result;
    }

    private static int arrToNum(int[] arr) {
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            value = value * 10 + arr[i];
        }
        return value;
    }
}
