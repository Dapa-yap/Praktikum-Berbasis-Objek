public class RuangKelas {
    public String kodeRuang;
    public String namaGedung;
    public int kapasitas;
    public int jumlahMahasiswa;

    public int hitungSisaKursi(){
        return kapasitas - jumlahMahasiswa;
    }
    public void tampilData() {
        System.out.println("Kode Ruang       : " + kodeRuang);
        System.out.println("Nama Gedung      : " + namaGedung);
        System.out.println("Kapasitas        : " + kapasitas + " kursi");
        System.out.println("Jumlah Mahasiswa : " + jumlahMahasiswa + " mahasiswa");
        System.out.println("Sisa Kursi       : " + hitungSisaKursi() + " kursi");
        System.out.println("-----------------------------------------------");
    }
}
