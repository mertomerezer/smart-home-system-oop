public abstract class Devices {

    private String cihazAdi;
    private boolean acikMi;

    public Devices(String cihazAdi){
        this.cihazAdi=cihazAdi;
        this.acikMi=false;

    }
    public void ac(){
    if(acikMi == false){
        acikMi= true;
        System.out.println(cihazAdi+" Açıldı");
    }else{
        System.out.println("Zaten açık");
        }
    }

    public void kapa(){
        if(acikMi==true){
            acikMi=false;
            System.out.println(cihazAdi+" Kapandı");
        }else{
            System.out.println("Zaten Kapalı");
        }

    }

    public boolean isacikMi(){
        return acikMi;

    }

    public String getCihazAdi(){

        return cihazAdi;
    }

    abstract void durumGoster();
}
