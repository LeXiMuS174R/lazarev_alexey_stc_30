package HomeWork1;

class HomeWork {
    public static void main(String[] args) {
        int number = 32475;

        System.out.println("number = " + number);

        int d1 = number / 10000;
        number = number - d1 * 10000;
        int d2 = number / 1000;
        number = number - d2 * 1000;
        int d3 = number / 100;
        number = number - d3 * 100;
        int d4 = number / 10;
        number = number - d4 * 10;
        int d5 = number / 1;

        System.out.println("1 digit = " + d1);
        System.out.println("2 digit = " + d2);
        System.out.println("3 digit = " + d3);
        System.out.println("4 digit = " + d4);
        System.out.println("5 digit = " + d5);

        int digitsSum = d1 + d2 + d3 + d4 + d5;

        System.out.println("Digit Sum = " + digitsSum);
    }
}