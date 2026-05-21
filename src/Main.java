import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House h1 = new House();

        while(true){
            System.out.println("1- Cihaz Ekle");
            System.out.println("2- Cihazları Listele");
            System.out.println("3- Cihaz Bul");
            System.out.println("4- Çıkış");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Cihaz tipi seçiniz:");
                    System.out.println("1 - SmartTV");
                    System.out.println("2 - SmartLight");
                    System.out.println("3 - AirConditioner");
                    System.out.println("4 - DoorLock");

                    int type = scanner.nextInt();
                    Devices cihaz = null;
                    System.out.println("Cihazın adını belirleyin");
                    String name = scanner.nextLine();

                    switch(type){
                        case 1: cihaz = new SmartTV(name);
                                        break;
                        case 2: cihaz = new Smartlight(name);
                                        break;
                        case 3: cihaz = new AirConditioner(name);
                                        break;
                        case 4: cihaz = new DoorLock(name);
                                        break;
                        default:
                            System.out.println("Geçersiz Cihaz tipi");
                            break;
                    }

                case 2: h1.tumCihazlariGoster();
                        break;
                case 3: break;
                case 4:
                    System.out.println("Çıkış Yapılıyor");
                    return;
            }




        }

    }
}