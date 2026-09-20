package MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn=true;
    }
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if (kontakOn ==true) {
            if (kecepatan + 5 <= 100) {
             kecepatan += 5;   
            } else {
                System.out.println("Kecepatan sudah mencapai batas maksimal");
                kecepatan = 100;
            }

        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }

    public void printStatus(){
        if(kontakOn== true){
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak OF");
        }
        System.out.println("kecepatan " + kecepatan +"\n");
    }
}
