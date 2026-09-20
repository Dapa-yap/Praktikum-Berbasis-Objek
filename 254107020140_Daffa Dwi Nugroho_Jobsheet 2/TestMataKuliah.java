public class TestMataKuliah {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "IF101";
        mk1.namaMK = "Pemrograman Berorientasi Objek";
        mk1.sks = 3;
        mk1.nilaiAngka = 3.5;

        MataKuliah mk2 = new MataKuliah();
        mk2.kodeMK = "IF102";
        mk2.namaMK = "Struktur Data";
        mk2.sks = 3;
        mk2.nilaiAngka = 4.0;

        MataKuliah mk3 = new MataKuliah();
        mk3.kodeMK = "IF103";
        mk3.namaMK = "Basis Data";
        mk3.sks = 2;
        mk3.nilaiAngka = 3.0;

        System.out.println("=== Data Mata Kuliah ===\n");
        mk1.tampilData();
        mk2.tampilData();
        mk3.tampilData();

        double totalBobot = mk1.hitungBobotNilai() + mk2.hitungBobotNilai() + mk3.hitungBobotNilai();
        System.out.println("Total Bobot Nilai dari ketiga mata kuliah: " + totalBobot);
    }
}