package oop2A;

class MobilContoh {
    private int kecepatan = 0;
    private boolean kontaksOn = false;
    
    public void tampilkanStatus(){
        if(kontaksOn == true){
            System.out.println("Kontak on");
        }
        else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan " + kecepatan );
    }

    public void nyalakanMesin() {
        kontaksOn = true;
    }

    public void matikanMesin() {
        kontaksOn = false;
        kecepatan = 0;
    }

    public void setKecepatan(int nilai) {
        if (kontaksOn) {
            kecepatan += nilai; 
        } else {
            System.out.println("Tidak bisa menambah kecepatan, Nyalakan mesin");
        }
    }

    public int getKecepatan(){
        return kecepatan;
    }


}

public class  Mobil {
 public static void main(String[] args) {
    MobilContoh mb1 = new MobilContoh();

    mb1.tampilkanStatus();
    mb1.nyalakanMesin();
    mb1.setKecepatan(30);
    mb1.tampilkanStatus();
    mb1.matikanMesin();
    mb1.setKecepatan(20);
    mb1.tampilkanStatus();
    mb1.setKecepatan(10);
    mb1.tampilkanStatus();
    int kecepatan = mb1.getKecepatan();
    System.out.println(kecepatan);
 }
    
}
