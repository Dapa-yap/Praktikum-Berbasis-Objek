public class sandal {
    private String jenisSandal; 
    private String bahanSol;
    public sandal(String jenisSandal, String bahanSol) {
        this.jenisSandal = jenisSandal;
        this.bahanSol = bahanSol;
    }
    public void pakai() {
        System.out.println("Sandal " + jenisSandal + " berbahan sol " + bahanSol + " sedang dipakai.");
    }
    public void lepas() {
        System.out.println("Sandal " + jenisSandal + " dilepas di depan pintu.");
    }
    public void cetakInformasi() {
        System.out.println("=== Informasi Sandal ===");
        System.out.println("Jenis     : " + jenisSandal);
        System.out.println("Bahan Sol : " + bahanSol);
    }
}