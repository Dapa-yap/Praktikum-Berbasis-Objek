public class sepatuBola extends sepatu {
    private String jenisPul;
    private String bahanUpper;
    public sepatuBola(String merek, int ukuran, String jenisPul, String bahanUpper) {
        super(merek, ukuran);
        this.jenisPul = jenisPul;
        this.bahanUpper = bahanUpper;
    }
    public void menendang() {
        System.out.println(getMerek() + " digunakan untuk menendang bola dengan pul jenis " + jenisPul + ".");
    }
    public void mengontrolBola() {
        System.out.println("Bahan " + bahanUpper + " pada " + getMerek() + " membantu kontrol bola jadi lebih presisi.");
    }
    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Jenis        : Sepatu Bola");
        System.out.println("Jenis Pul    : " + jenisPul);
        System.out.println("Bahan Upper  : " + bahanUpper);
    }
}