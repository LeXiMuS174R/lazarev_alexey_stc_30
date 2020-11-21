package HomeWork13;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(150);
        myArrayList.add(2145);
        myArrayList.add(12354);
        myArrayList.add(657567);
        myArrayList.add(125000);
        myArrayList.add(666);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        myArrayList.removeByIndex(1);
        System.out.println(myArrayList);
        myArrayList.insert(750, 1);
        System.out.println(myArrayList);
        System.out.println();
    }
}
