package HomeWork11;

public class MainLinkedList {

    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        list.reverse();

        list.removeByIndex(0);

        list.removeFirst(3);

        list.insert(99, 2);

        System.out.println(list.contains(2));

        System.out.println("Размер списка = " + list.size());

        System.out.println("вывод списка");
        list.PrintArray();

        System.out.println("Получены элементы:");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));

    }
}
