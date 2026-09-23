package Tugas;

public class MainRumahSakit {
    public static void main(String[] args) {
        // Objek diciptakan mandiri di luar class pemilik
        Dokter drAndi = new Dokter("Andi", "Sp.PD");
        Pasien budi = new Pasien("Budi", "Demam tinggi");

        // Pembuatan Rumah Sakit (otomatis membuat RuangUGD di dalamnya)
        RumahSakit rsSehat = new RumahSakit("RS Sehat Selalu");
        
        // Memasukkan dokter ke dalam RS (Aggregation)
        rsSehat.setDokterJaga(drAndi);
        
        // Menjalankan operasional (Dependency Dokter -> Pasien terjadi di sini)
        rsSehat.operasional(budi);
    }
}
