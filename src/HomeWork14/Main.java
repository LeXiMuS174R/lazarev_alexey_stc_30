package HomeWork14;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMapImpl<>();

        map.put("Марсель", 26);
        map.put("Марсель", 27);
        map.put("Данис", 27);
        map.put("Алексей", 24);
//        map.put("Александр", 35);
        map.put("Валерия", 22);
        map.put("Андрей", 47);
        map.put("Виктор", 18);
        map.put("Виктор Александрович", 18);

        System.out.println(map.get("Марсель"));
        System.out.println(map.get("Данис"));
        System.out.println(map.get("Алексей"));
//        System.out.println(map.get("Александр"));
        System.out.println(map.get("Валерия"));
        System.out.println(map.get("Андрей"));
        System.out.println(map.get("Виктор Александрович"));
        System.out.println(map.get("qwerty"));
        System.out.println();


        Set<String> set = new HashSetImpl<>();

        set.add("Марсель");
        set.add("Данис");
        set.add("Алексей");
//        set.add("Александр");
        set.add("Валерия");
        set.add("Андрей");
        set.add("Виктор");
        set.add("Виктор Александрович");


        set.contains("Марсель");
        set.contains("Данис");
        set.contains("Алексей");
//        set.contains("Александр");
        set.contains("Валерия");
        set.contains("Андрей");
        set.contains("Виктор");
        set.contains("Виктор Александрович");
        set.contains("qwerty");

        System.out.println(set.contains("Марсель"));
        System.out.println(set.contains("Данис"));
        System.out.println(set.contains("Алексей"));
//        System.out.println(set.contains("Александр"));
        System.out.println(set.contains("Валерия"));
        System.out.println(set.contains("Андрей"));
        System.out.println(set.contains("Виктор"));
        System.out.println(set.contains("Виктор Александрович"));
        System.out.println(set.contains("qwerty"));
        System.out.println();

        int i = 0;

        System.out.println("Hello, Andrey!".hashCode());
    }
}
