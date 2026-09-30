public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    // Pegawai biasa belum punya perhitungan gaji, di-override oleh subclass
    public int getGaji() {
        return 0;
    }
}