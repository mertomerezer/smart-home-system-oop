import java.util.ArrayList;

public class House {
    private ArrayList<Devices> cihazlar;

    public House() {
        cihazlar = new ArrayList<>();
    }

    public void cihazEkle(Devices cihaz) {
        cihazlar.add(cihaz);
        System.out.println(cihaz.getCihazAdi() + " Eklendi");

    }

    public void tumCihazlariGoster() {
        for (Devices i : cihazlar) {
            i.durumGoster();

        }
    }

    public Devices cihazBul(String cihazAdi) {

        for (Devices a : cihazlar) {
            if (a.getCihazAdi().equalsIgnoreCase(cihazAdi)) {
                return a;
            }
        }

        System.out.println("Cihaz bulunamadı");
        return null;
    }

}







