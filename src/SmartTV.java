public class SmartTV extends Devices {

    private int volumeLevel = 10;
    private int channelNo = 1;

    public SmartTV(String deviceName) {
        super(deviceName);
    }

    public void changeChannel(int newChannel) {
        if (newChannel <= 10 && newChannel >= 1) {
            channelNo = newChannel;
            System.out.println("Channel changed.");
            System.out.println("Channel: " + channelNo);
        } else {
            System.out.println("Please select a channel between 1 and 10.");
        }
    }

    public void increaseVolume() {
        if (volumeLevel < 100) {
            volumeLevel++;
            System.out.println("New volume: " + volumeLevel);
        } else {
            System.out.println("Volume is at maximum level.");
        }
    }

    public void decreaseVolume() {
        if (volumeLevel > 0) {
            volumeLevel--;
            System.out.println("New volume: " + volumeLevel);
        } else {
            System.out.println("Volume is at minimum level.");
        }
    }

    @Override
    public void showStatus() {
        System.out.println(getDeviceName());
        if (isOn()) {
            System.out.println("Smart TV is ON.");
            System.out.println("Current Channel: " + channelNo);
            System.out.println("Volume Level: " + volumeLevel);
        } else {
            System.out.println("Smart TV is OFF.");
        }
    }
}