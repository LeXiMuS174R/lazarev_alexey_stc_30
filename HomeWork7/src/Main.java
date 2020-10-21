public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .age(26)
                .firstName("Marsel")
                .setWorker()
                .lastName("Sidikov")
                .build();

        User user2 = new User.Builder()
                .age(24)
                .firstName("Alexey")
                .lastName("Lazarev")
                .build();

        System.out.println("Fisrt name - " + user.getFirstName());
        System.out.println("Last name - " + user.getLastName());
        System.out.println("Age - " + user.getAge());
        System.out.println("isWorker? - " + user.isWorker() + "\n");

        System.out.println("Fisrt name - " + user2.getFirstName());
        System.out.println("Last name - " + user2.getLastName());
        System.out.println("Age - " + user2.getAge());
        System.out.println("isWorker? - " + user2.isWorker());
    }
}
