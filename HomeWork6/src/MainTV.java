import java.rmi.Remote;

public class MainTV {

    public static void main(String[] args) {
        Programs[] programsSet0 = new Programs[]{
                new Programs("Good Morning on 1TV"),
                new Programs("Top News"),
                new Programs("Live healthy"),
                new Programs("Fashionable verdict"),
                new Programs("Evening news")
        };

        Programs[] programsSet1 = new Programs[]{
                new Programs("Russia morning"),
                new Programs("In secret to the whole world"),
                new Programs("Five for one"),
                new Programs("One hundred to one"),
                new Programs("News, Russia")
        };

        Programs[] programsSet2 = new Programs[]{
                new Programs("The Adventures of Woody and His Friends"),
                new Programs("Trolls. The holiday continues!"),
                new Programs("Show \"Ural dumplings\""),
                new Programs("Three cats"),
                new Programs("Kitchen. Hotel War")
        };

        Programs[] programsSet3 = new Programs[]{
                new Programs("New Morning"),
                new Programs("Comedy Club"),
                new Programs("Sasha Tanya"),
                new Programs("Once in Russia"),
                new Programs("Dances")
        };

        Programs[] programsSet4 = new Programs[]{
                new Programs("PRO-News"),
                new Programs("Made in the 90s"),
                new Programs("Forecast by year"),
                new Programs("Thor 30 - Russian Cool of the week"),
                new Programs("Time is ticking")
        };

        Programs[] programsSet5 = new Programs[]{
                new Programs("Friday! morning"),
                new Programs("Lads"),
                new Programs("Heads and Tails. Reboot"),
                new Programs("The world inside out. China"),
                new Programs("Revizorro")
        };

        Channel[] channels = new Channel[]{
                new Channel(0, programsSet0),
                new Channel(1, programsSet1),
                new Channel(2, programsSet2),
                new Channel(3, programsSet3),
                new Channel(4, programsSet4),
                new Channel(5, programsSet5)
        };

        TV tv = new TV(channels);
        RemoteConroller remoteConroller = new RemoteConroller(tv);
        remoteConroller.setChannel(0);
        remoteConroller.setChannel(1);
        remoteConroller.setChannel(2);
        remoteConroller.setChannel(3);
        remoteConroller.setChannel(4);
        remoteConroller.setChannel(5);
    }
}
