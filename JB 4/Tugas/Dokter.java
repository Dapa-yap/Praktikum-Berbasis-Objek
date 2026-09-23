package Tugas;

public class Dokter {
    private String nama;
    private String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }
    // --> BUKTI DEPENDENCY: Pasien hanya menjadi parameter sementara di method ini.
    // Dokter tidak menyimpan Pasien sebagai atribut tetap.
    public void periksa(Pasien pasien) {
        System.out.println("dr. " + nama + " (" + spesialis + ") sedang memeriksa " + 
                           pasien.getNama() + " dengan keluhan: " + pasien.getKeluhan());
    }
    public String getNama() { return nama; }
}
