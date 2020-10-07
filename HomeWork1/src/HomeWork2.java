class HomeWork2 {
    public static void main(String[] args) {
        int number = 32475;

        //Hard Variant
        int bin1 = 32475 % 2;
        int n1 = number / 2;

        int bin2 = n1 % 2;
        int n2 = n1 / 2;

        int bin3 = n2 % 2;
        int n3 = n2 / 2;

        int bin4 = n3 % 2;
        int n4 = n3 / 2;

        int bin5 = n4 % 2;
        int n5 = n4 / 2;

        int bin6 = n5 % 2;
        int n6 = n5 / 2;

        int bin7 = n6 % 2;
        int n7 = n6 / 2;

        int bin8 = n7 % 2;
        int n8 = n7 / 2;

        int bin9 = n8 % 2;
        int n9 = n8 / 2;

        int bin10 = n9 % 2;
        int n10 = n9 / 2;

        int bin11 = n10 % 2;
        int n11 = n10 / 2;

        int bin12 = n11 % 2;
        int n12 = n11 / 2;

        int bin13 = n12 % 2;
        int n13 = n12 / 2;

        int bin14 = n13 % 2;
        int n14 = n13 / 2;

        int bin15 = n14 % 2;
        int n15 = n14 / 2;

        System.out.println("Number (L) - " + number + " in binary = " + bin15 + bin14 + bin13 + bin12 + bin11 + bin10
                + bin9 + bin8 + bin7 + bin6 + bin5 + bin4 + bin3 + bin2 + bin1);

        //Other Variant
        String binaryNumber = Integer.toBinaryString(number);
        System.out.println("Number (S) - " + number + " in binary = " + binaryNumber);
    }
}