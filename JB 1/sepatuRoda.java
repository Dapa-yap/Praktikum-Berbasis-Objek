public class sepatuRoda extends sepatu {
    private int jumlahRoda;
    private String bahanRoda;

    public sepatuRoda(String merek, int ukuran, int jumlahRoda, String bahanRoda) {
        super(merek, ukuran); 
        this.jumlahRoda = jumlahRoda;
        this.bahanRoda = bahanRoda;
    }
    public void berjalan() {
        System.out.println(getMerek() + " berjalan di jalan dengan " + jumlahRoda + " roda berbahan " + bahanRoda + ".");
    }
    public void rem() {
        System.out.println("Menekan tumit untuk mengerem " + getMerek() + ".");
    }
    @Override
    public void cetakInformasi() {
        super.cetakInformasi(); 
        System.out.println("Jenis        : Sepatu Roda");
        System.out.println("Jumlah Roda  : " + jumlahRoda);
        System.out.println("Bahan Roda   : " + bahanRoda);
    }
}