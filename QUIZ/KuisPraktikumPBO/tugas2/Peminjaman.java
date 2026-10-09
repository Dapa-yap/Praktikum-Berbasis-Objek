/**
 * TUGAS 2 - Relasi antar class.
 * Satu objek Peminjaman mencatat SATU mahasiswa yang meminjam SATU laptop.
 * Lengkapi setiap bagian bertanda TODO.
 */
public class Peminjaman {

    // TODO: deklarasikan atribut private (mahasiswa, laptop, aktif)
    private final Mahasiswa mahasiswa;
    private final Laptop laptop;
    private boolean aktif;
    public Peminjaman(Mahasiswa mahasiswa, Laptop laptop) {
        // TODO: simpan mahasiswa dan laptop. Peminjaman baru selalu aktif.
        this.mahasiswa = mahasiswa;
        this.laptop = laptop;
        this.aktif = true;
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public Mahasiswa getMahasiswa() {
        // TODO
        return mahasiswa;
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public Laptop getLaptop() {
        // TODO
        return laptop;
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public boolean isAktif() {
        // TODO
        return aktif;
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public void selesai() {
        // TODO: tandai peminjaman sudah tidak aktif
        aktif = false;
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }
}
