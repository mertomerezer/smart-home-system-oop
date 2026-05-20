public class Smartlight extends Devices{
    private int parlaklik = 50;
    public Smartlight(String cihazAdi){
        super(cihazAdi);
    }
    public void parlaklikArttir(){
        if(parlaklik==100){
            System.out.println("Maksimum parlaklık");
        }else{
            parlaklik +=10;
            System.out.println("Parlaklık arttırıldı");
        }
    }
    public void parlaklikAzalt(){
        if(parlaklik==0){
            System.out.println("Minimum parlaklık");
        }else{
            parlaklik -=10;
            System.out.println("Parlaklık azaltıldı");
        }
    }
    @Override
    public void durumGoster(){
        System.out.println(getCihazAdi());
        if(isacikMi()){
            System.out.println("Akıllı Lamba Açık");
            System.out.println("Mevcut Parlaklık: "+parlaklik);
        }else{
            System.out.println("Akıllı Lamba Kapalı");
        }
    }
}
