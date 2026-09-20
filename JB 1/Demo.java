public class Demo {
    public static void main(String[] args) {
        sepatu sepatu = new sepatu("Nike", 40);
        System.out.println("Objek Sepatu");
        sepatu.pakai();
        sepatu.lepas();
        sepatu.cetakInformasi();
        System.out.println();

        sepatuRoda sepatuRoda = new sepatuRoda("Cougar", 39, 4, "poliuretan");
        System.out.println("Objek Sepatu Roda");
        sepatuRoda.pakai();      
        sepatuRoda.berjalan();   
        sepatuRoda.rem();        
        sepatuRoda.cetakInformasi();
        sepatuRoda.lepas();      
        System.out.println();

        sepatuBola sepatuBola = new sepatuBola("Specs", 41, "FG (Firm Ground)", "kulit sintetis");
        System.out.println("Objek Sepatu Bola");
        sepatuBola.pakai();                  
        sepatuBola.menendang();              
        sepatuBola.mengontrolBola();  
        sepatuBola.cetakInformasi();
        sepatuBola.lepas();       
        System.out.println();

        kaosKaki kaosKaki = new kaosKaki("katun", 20);
        System.out.println("Objek Kaos Kaki");
        kaosKaki.pakai();
        kaosKaki.cuci();
        kaosKaki.cetakInformasi();
        System.out.println();

        sandal sandal = new sandal("jepit", "karet");
        System.out.println("Objek Sandal");
        sandal.pakai();
        sandal.lepas();
        sandal.cetakInformasi();
    }
}