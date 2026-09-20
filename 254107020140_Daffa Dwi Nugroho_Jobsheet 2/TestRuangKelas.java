public class TestRuangKelas {
    public static void main(String[] args) {
        RuangKelas r1 = new RuangKelas();
        r1.kodeRuang = "R101";
        r1.namaGedung = "Gedung AS";
        r1.kapasitas = 40;
        r1.jumlahMahasiswa = 35;
        RuangKelas r2 = new RuangKelas();
        r2.kodeRuang = "R102";
        r2.namaGedung = "Gedung AO";
        r2.kapasitas = 45;
        r2.jumlahMahasiswa = 35;
        RuangKelas r3 = new RuangKelas();
        r3.kodeRuang = "R103";
        r3.namaGedung = "Gedung AE";
        r3.kapasitas = 50;
        r3.jumlahMahasiswa = 48;
 
        System.out.println("=== Data Ruang Kelas ===\n");
        r1.tampilData();
        r2.tampilData();
        r3.tampilData();
    }
}