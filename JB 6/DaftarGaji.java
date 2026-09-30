public class DaftarGaji {
    public Pegawai[] listPegawai;
    private int jumlah = 0;

    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
    }

    public void addPegawai(Pegawai p) {
        if (jumlah < listPegawai.length) {
            listPegawai[jumlah++] = p;
        } else {
            System.out.println("Daftar penuh, " + p.getNama() + " tidak dapat ditambahkan.");
        }
    }

    public void printSemuaGaji() {
        System.out.println("=== DAFTAR GAJI PEGAWAI ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + listPegawai[i].getNama()
                    + " (NIP: " + listPegawai[i].nip + ")"
                    + " | Gaji: Rp" + listPegawai[i].getGaji());
        }
    }
}