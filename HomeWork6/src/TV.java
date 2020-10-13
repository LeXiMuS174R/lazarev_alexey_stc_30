public class TV {
    private Channel channel[];
    private boolean isON;

    public TV(Channel[] channel) {
        this.channel = channel;
        this.isON = false;
    }

    public void setON() {
        this.isON = true;
    }

    public void setOFF() {
        this.isON = false;
    }

    public void setChannel(int channelNumber) {
        Channel currentChannel = channel[channelNumber];
        int countPrograms = currentChannel.getPrograms().length;
        int randomPrograms = (int) (Math.random() * countPrograms);
        Programs selectedProgram = currentChannel.getPrograms()[randomPrograms];
        System.out.println("Selected Program on " + channelNumber + " channel - " + selectedProgram.getNamePrograms());
    }
}
