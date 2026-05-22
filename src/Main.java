import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        House h1 = new House();

        while (true) {

            System.out.println("\n1- Add Device");
            System.out.println("2- List Devices");
            System.out.println("3- Find Device");
            System.out.println("4- Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("Select device type:");
                    System.out.println("1 - SmartTV");
                    System.out.println("2 - SmartLight");
                    System.out.println("3 - AirConditioner");
                    System.out.println("4 - DoorLock");

                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter a name for the device:");
                    String name = scanner.nextLine();

                    Devices device = null;

                    switch (type) {

                        case 1:
                            device = new SmartTV(name);
                            break;

                        case 2:
                            device = new Smartlight(name);
                            break;

                        case 3:
                            device = new AirConditioner(name);
                            break;

                        case 4:
                            device = new DoorLock(name);
                            break;

                        default:
                            System.out.println("Invalid device type");
                            break;
                    }

                    if (device != null) {
                        h1.addDevice(device);
                    }

                    break;

                case 2:
                    h1.showAllDevices();
                    break;

                case 3:

                    System.out.println("Enter a device name:");
                    String find = scanner.nextLine();

                    Devices device2 = h1.findDevice(find);

                    if (device2 != null) {

                        System.out.println("1 - Turn On");
                        System.out.println("2 - Turn Off");
                        System.out.println("3 - Show Status");

                        int selection = scanner.nextInt();
                        scanner.nextLine();

                        switch (selection) {

                            case 1:
                                device2.turnOn();
                                break;

                            case 2:
                                device2.turnOff();
                                break;

                            case 3:
                                device2.showStatus();
                                break;

                            default:
                                System.out.println("Invalid selection");
                        }

                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}