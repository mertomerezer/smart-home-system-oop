public class DoorLock extends Devices {

    private boolean isLocked;

    public DoorLock(String deviceName) {
        super(deviceName);
        this.isLocked = false;
    }

    public void lock() {
        if (isLocked == false) {
            isLocked = true;
            System.out.println("Door locked.");
        } else {
            System.out.println("Door is already locked.");
        }
    }

    public void unlock() {
        if (isLocked == true) {
            isLocked = false;
            System.out.println("Door unlocked.");
        } else {
            System.out.println("Door is already unlocked.");
        }
    }

    @Override
    public void showStatus() {
        System.out.println(getDeviceName());
        if (isOn()) {
            System.out.println("Door is open.");
        } else {
            System.out.println("Door is closed.");
        }
        System.out.println("Lock status: " + isLocked);
    }
}