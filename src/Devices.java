public abstract class Devices {

    private String deviceName;
    private boolean isOn;

    public Devices(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() {
        if (isOn == false) {
            isOn = true;
            System.out.println(deviceName + " turned on.");
        } else {
            System.out.println("Already on.");
        }
    }

    public void turnOff() {
        if (isOn == true) {
            isOn = false;
            System.out.println(deviceName + " turned off.");
        } else {
            System.out.println("Already off.");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public String getDeviceName() {
        return deviceName;
    }

    abstract void showStatus();
}