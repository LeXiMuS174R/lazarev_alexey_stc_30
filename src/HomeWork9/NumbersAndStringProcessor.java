package HomeWork9;

public class NumbersAndStringProcessor {
    private String[] lines;
    private int[] numbers;

    public NumbersAndStringProcessor(String[] lines, int[] numbers) {
        this.lines = lines;
        this.numbers = numbers;
    }

    public String[] strProcess(StringsProcess process) {
        String[] result = new String[lines.length];
        for (int i = 0; i < lines.length; i++) {
            result[i] = process.process(lines[i]);
        }
        return result;
    }

    public int[] numProcess(NumbersProcess process) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = process.process(numbers[i]);
        }
        return result;
    }
}
