import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TUGAS 2 - Relasi antar class.
 * Laboratorium menampung banyak Laptop dan mencatat semua Peminjaman.
 * Lengkapi setiap bagian bertanda TODO sesuai spesifikasi di lembar soal.
 */
public class Laboratorium {
    public static final int MAKS_PINJAM = 2;   // batas pinjaman aktif per mahasiswa

    private final String nama;
    private final List<Laptop> daftarLaptop = new ArrayList<>();
    private final List<Peminjaman> riwayat = new ArrayList<>();

    public Laboratorium(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public boolean tambahLaptop(Laptop lp) {
        // TODO
        if (lp == null || cariLaptop(lp.getKodeAset()) != null) {
            return false;
        }
        daftarLaptop.add(lp);
        //throw new UnsupportedOperationException("Belum diimplementasikan");
        return true;
    }

    public Laptop cariLaptop(String kodeAset) {
        // TODO
        for (Laptop lp : daftarLaptop) {
            if (lp.getKodeAset().equals(kodeAset)) {
                return lp;
            }
        }
        //throw new IllegalArgumentException("Laptop tidak ditemukan");
        return null;
    }

    public int jumlahPinjamanAktif(Mahasiswa m) {
        // TODO
        int jumlah = 0;
        for (Peminjaman p : riwayat) {
            if (p.isAktif() && p.getMahasiswa().getNim().equals(m.getNim())) {
                jumlah++;
            }
        }
        //throw new UnsupportedOperationException("Belum diimplementasikan");
        return jumlah;
    }

    public Peminjaman pinjamkan(Mahasiswa m, String kodeAset) {
        // TODO
        Laptop lp = cariLaptop(kodeAset);
        if (lp == null || !lp.isTersedia() || jumlahPinjamanAktif(m) >= MAKS_PINJAM) {
            return null;
        }
        lp.pinjam();
        Peminjaman p = new Peminjaman(m, lp);
        riwayat.add(p);
        return p;
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public boolean kembalikan(String kodeAset) {
        // TODO
        for (Peminjaman p : riwayat) {
            if (p.isAktif() && p.getLaptop().getKodeAset().equals(kodeAset)) {
                p.getLaptop().kembalikan();
                p.selesai();
                return true;
            }
        }
        //throw new UnsupportedOperationException("Belum diimplementasikan");
        return false;
    }

    public List<Laptop> getDaftarLaptop() {
        // TODO: kembalikan daftar yang TIDAK bisa diubah dari luar class
        //throw new UnsupportedOperationException("Belum diimplementasikan");
        return Collections.unmodifiableList(daftarLaptop);
    }
}
