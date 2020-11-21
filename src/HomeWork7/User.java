package HomeWork7;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isWorker;

    public User(String firstName, String lastName, int age, boolean isWorker) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isWorker = isWorker;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private int age;
        private boolean isWorker = false;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder isWorker(boolean isWorker) {
            this.isWorker = isWorker;
            return this;
        }

        public Builder setWorker() {
            this.isWorker = true;
            return this;
        }

        public User build() {
            return new User(this.firstName, this.lastName, this.age, this.isWorker);
        }
    }
}
