package zbooksexamples;

public class RemoteControlTV {
    private double width;
    private double height;
    private double screenSize;
    private int maxVolume;
    private int volume = 12;
    private boolean power;

    public RemoteControlTV(double width, double height, double screenSize) {
        this.width = width;
        this.height = height;
        this.screenSize = screenSize;
    }

    public double channelTuning(int channel) {
        switch (channel) {
            case 1:
                return 34.56;
            case 2:
                return 54.89;
            case 3:
                return 73.89;
            case 4:
                return 94.89;
        }
        return 0;
    }

    public int decreaseVolume() {
        if (0 < volume) {
            volume--;
        }
        return volume;
    }

    public void powerSwitch() {
        this.power = !power;
    }

    public int increaseVolume() {
        if (maxVolume > volume) {
            volume++;
        }
        return volume;
    }

    public static void main(String[] args) {
        RemoteControlTV t = new RemoteControlTV(11.5, 7, 9);
        t.powerSwitch();
        System.out.println(t.width);
        System.out.println(t.channelTuning(2));
        System.out.println(t.decreaseVolume());
        System.out.println(t.screenSize);

    }
}
