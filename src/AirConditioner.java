public class AirConditioner extends Devices{
    private int sicaklik = 22;

    public AirConditioner(String cihazAdi){
        super(cihazAdi);
    }

    public void sicaklikArttir(){
        if(sicaklik<30){
            sicaklik+=1;
            System.out.println("Sıcaklık arttırıldı");
            System.out.println("Mevcut Sıcaklık: "+sicaklik);

        }else System.out.println("Sıcaklık maksimum seviyede");
    }

    public void sicaklikAzalt(){
        if(sicaklik>16) {
            sicaklik-=1;
            System.out.println("Sıcaklık azaltıldı");
            System.out.println("Mevcut Sıcaklık: "+sicaklik);
        }
        else System.out.println("Sıcaklık minimum seviyede");
    }

    public void sicaklikAyarla(int derece){
        if(derece>=16 && derece<=30){
            sicaklik = derece;
            System.out.println("Sıcaklık istediğiniz dereceye ayarlandı");
            System.out.println("Yeni Sıcaklık: "+sicaklik);
        }else System.out.println("Sıcaklık 16 ile 30 arasında olmalı");
    }

    @Override
    public void durumGoster(){
        System.out.println(getCihazAdi());
        if(isacikMi()){
            System.out.println("Klima Açık");
            System.out.println("Mevcut sıcaklık: "+sicaklik);
        }else{
            System.out.println("Klima Kapalı");
        }
    }
}






