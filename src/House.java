import java.util.ArrayList;

public class House {

    private ArrayList<Devices> devices;

    public House() {
        devices = new ArrayList<>();
    }

    public void addDevice(Devices device) {
        devices.add(device);
        System.out.println(device.getDeviceName() + " added.");
    }

    public void showAllDevices() {
        if (devices.isEmpty()) {
            System.out.println("No devices to display.");
        }
        for (Devices d : devices) {
            d.showStatus();
        }
    }

    public Devices findDevice(String deviceName) {
        for (Devices d : devices) {
            if (d.getDeviceName().equalsIgnoreCase(deviceName)) {
                return d;
            }
        }
        System.out.println("Device not found.");
        return null;
    }
}