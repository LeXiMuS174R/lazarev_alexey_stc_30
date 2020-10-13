public class Programs {
    private String nameProgram;

    public String getNamePrograms() {
        return nameProgram;
    }

    public Programs(String nameProgram) {
        this.nameProgram = nameProgram;
        System.out.println("Created " + this.toString());
    }

    @Override
    public String toString() {
        return "Program{" +
                "nameProgram='" + nameProgram + '\'' +
                '}';
    }
}
