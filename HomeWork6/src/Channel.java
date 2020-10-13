import java.util.Arrays;

public class Channel {
    private int number;
    private Programs programs[];

    public Channel(int number, Programs[] programs) {
        this.number = number;
        this.programs = programs;
//        System.out.println("Created " + this.toString());
    }

    public Programs[] getPrograms() {
        return programs;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "number=" + number +
                ", program=" + Arrays.toString(programs) +
                '}';
    }
}
