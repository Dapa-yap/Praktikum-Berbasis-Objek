public class Tugas {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("198001012005", "Budi Santoso", "Malang");
        d1.setSKS(12);

        Dosen d2 = new Dosen("198505052010", "Siti Aminah", "Surabaya");
        d2.setSKS(10);

        System.out.println("Nama : " + d1.getNama() + ", Gaji : Rp" + d1.getGaji());
        System.out.println("Nama : " + d2.getNama() + ", Gaji : Rp" + d2.getGaji());
        System.out.println();

        DaftarGaji daftar = new DaftarGaji(5);
        daftar.addPegawai(d1);
        daftar.addPegawai(d2);
        daftar.printSemuaGaji();
    }
}