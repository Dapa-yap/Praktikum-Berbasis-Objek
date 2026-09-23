package Tugas;

public class RumahSakit {
    private String namaRS;
    private RuangUGD ugd;      // Atribut Composition
    private Dokter dokterJaga; // Atribut Aggregation

    public RumahSakit(String namaRS) {
        this.namaRS = namaRS;
        // --> BUKTI COMPOSITION: Objek RuangUGD diciptakan mutlak di dalam constructor RS.
        // Jika RumahSakit dihapus, RuangUGD otomatis lenyap.
        this.ugd = new RuangUGD(20); 
    }
    // --> BUKTI AGGREGATION: Objek Dokter diciptakan di luar, lalu diinjeksikan lewat setter.
    // Dokter bisa pindah atau tetap ada meskipun RumahSakit ini tutup/dihapus.
    public void setDokterJaga(Dokter dokter) {
        this.dokterJaga = dokter;
    }
    public void operasional(Pasien p) {
        System.out.println("--- " + namaRS + " ---");
        ugd.infoUGD();
        if (dokterJaga != null) {
            dokterJaga.periksa(p); 
        }
    }
}