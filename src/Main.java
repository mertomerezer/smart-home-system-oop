import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        House h1 = new House();

        while (true) {

            System.out.println("\n1- Cihaz Ekle");
            System.out.println("2- Cihazları Listele");
            System.out.println("3- Cihaz Bul");
            System.out.println("4- Çıkış");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("Cihaz tipi seçiniz:");
                    System.out.println("1 - SmartTV");
                    System.out.println("2 - SmartLight");
                    System.out.println("3 - AirConditioner");
                    System.out.println("4 - DoorLock");

                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Cihazın adını belirleyin:");
                    String name = scanner.nextLine();

                    Devices cihaz = null;

                    switch (type) {

                        case 1:
                            cihaz = new SmartTV(name);
                            break;

                        case 2:
                            cihaz = new Smartlight(name);
                            break;

                        case 3:
                            cihaz = new AirConditioner(name);
                            break;

                        case 4:
                            cihaz = new DoorLock(name);
                            break;

                        default:
                            System.out.println("Geçersiz cihaz tipi");
                            break;
                    }

                    if (cihaz != null) {
                        h1.cihazEkle(cihaz);
                    }

                    break;

                case 2:
                    h1.tumCihazlariGoster();
                    break;

                case 3:

                    System.out.println("Bir cihaz ismi girin:");
                    String find = scanner.nextLine();

                    Devices cihaz2 = h1.cihazBul(find);

                    if (cihaz2 != null) {

                        System.out.println("1 - Aç");
                        System.out.println("2 - Kapat");
                        System.out.println("3 - Durum Göster");

                        int secim = scanner.nextInt();
                        scanner.nextLine();

                        switch (secim) {

                            case 1:
                                cihaz2.ac();
                                break;

                            case 2:
                                cihaz2.kapa();
                                break;

                            case 3:
                                cihaz2.durumGoster();
                                break;

                            default:
                                System.out.println("Geçersiz seçim");
                        }

                    }
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçim");
            }
        }
    }
}