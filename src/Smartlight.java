public class Smartlight extends Devices {

    private int brightness = 50;

    public Smartlight(String deviceName) {
        super(deviceName);
    }

    public void increaseBrightness() {
        if (brightness == 100) {
            System.out.println("Maximum brightness reached.");
        } else {
            brightness += 10;
            System.out.println("Brightness increased.");
        }
    }

    public void decreaseBrightness() {
        if (brightness == 0) {
            System.out.println("Minimum brightness reached.");
        } else {
            brightness -= 10;
            System.out.println("Brightness decreased.");
        }
    }

    @Override
    public void showStatus() {
        System.out.println(getDeviceName());
        if (isOn()) {
            System.out.println("Smart Light is ON.");
            System.out.println("Current Brightness: " + brightness);
        } else {
            System.out.println("Smart Light is OFF.");
        }
    }
}