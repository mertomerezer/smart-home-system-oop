public class DoorLock extends Devices{
    private boolean kilitliMi;
    public DoorLock(String cihazAdi){
        super(cihazAdi);
        this.kilitliMi=false;
    }

    public void kilitle(){
        if(kilitliMi==false){
            kilitliMi=true;
            System.out.println("Kapı Kilitlendi");
        }else System.out.println("Kapı zaten kilitli");
    }

    public void kilidiAc(){
        if(kilitliMi==true){
            kilitliMi=false;
            System.out.println("Kapı Kiliti Açıldı");
        }else System.out.println("Kapının Kilidi Zaten Açık");
    }

    @Override
    public void durumGoster() {
        System.out.println(getCihazAdi());
        if (isacikMi()) {
            System.out.println("Kapı açık");
        } else {
            System.out.println("Kapı kapalı");
        }

        System.out.println("Kilit durumu: " + kilitliMi);
    }

}
