public class RemoteConroller {
    private TV tv;

    public RemoteConroller(TV tv) {
        this.tv = tv;
    }

    public void setChannel(int channelNumber) {
        this.tv.setChannel(channelNumber);
    }
}
