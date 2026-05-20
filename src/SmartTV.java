public class SmartTV extends Devices{
    private int sesSeviyesi = 10;
    private int kanalNo = 1;

    public SmartTV(String cihazAdi){
        super(cihazAdi);

    }

    public void kanalDegistir(int yeniKanal){
        if(yeniKanal<=10&&yeniKanal>=1){
            kanalNo = yeniKanal;
            System.out.println("Kanal Değiştirildi");
            System.out.println("Kanal: "+kanalNo);
        }else{
            System.out.println("1-10 Arasında bir kanal seçiniz");
        }
    }

    public void sesArttir(){
        if(sesSeviyesi<100){
            sesSeviyesi++;
            System.out.println("Yeni ses: "+sesSeviyesi);
        }else System.out.println("Ses Maksimum Seviyede");
    }

    public void sesAzalt(){
        if(sesSeviyesi>0){
            sesSeviyesi--;
            System.out.println("Yeni ses: "+sesSeviyesi);
        }else System.out.println("Ses Minimum Seviyede");
    }

    @Override
    public void durumGoster(){

        System.out.println(getCihazAdi());
        if(isacikMi()){
            System.out.println("Akıllı Televizyon Açık");
            System.out.println("Mevcut kanal: "+kanalNo);
            System.out.println("Ses Seviyesi: "+sesSeviyesi);
        }else{
            System.out.println("Akıllı Televizyon Kapalı");
        }
    }

    }


