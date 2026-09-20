public class sepatu {
    private String merek;
    private int ukuran;
    public sepatu(String merek, int ukuran) {
        this.merek = merek;
        this.ukuran = ukuran;
    }
    public String getMerek() {
        return merek;
    }
    public int getUkuran() {
        return ukuran;
    }
    public void pakai() {
        System.out.println("Sepatu merek " + merek + " ukuran " + ukuran + " sedang dipakai.");
    }
    public void lepas() {
        System.out.println("Sepatu merek " + merek + " dilepas dan disimpan di rak sepatu.");
    }
    public void cetakInformasi() {
        System.out.println("=== Informasi Sepatu ===");
        System.out.println("Merek  : " + merek);
        System.out.println("Ukuran : " + ukuran);
    }
}