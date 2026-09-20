public class kaosKaki {
    private String bahan;
    private int panjang; 
    public kaosKaki(String bahan, int panjang) {
        this.bahan = bahan;
        this.panjang = panjang;
    }
    public void pakai() {
        System.out.println("Kaos kaki berbahan " + bahan + " sepanjang " + panjang + " cm sedang dipakai.");
    }
    public void cuci() {
        System.out.println("Kaos kaki berbahan " + bahan + " sedang dicuci.");
    }
    public void cetakInformasi() {
        System.out.println("=== Informasi Kaos Kaki ===");
        System.out.println("Bahan   : " + bahan);
        System.out.println("Panjang : " + panjang + " cm");
    }
}