/**
 * TUGAS 1 - Enkapsulasi.
 * Lengkapi setiap bagian bertanda TODO sesuai spesifikasi di lembar soal.
 * Jangan mengubah nama class, nama method, maupun tipe parameternya.
 */
public class Laptop {
    private String kodeAset;
    private String merk;
    private int ramGB;
    private boolean tersedia;
    // TODO: deklarasikan atribut yang diperlukan (kodeAset, merk, ramGB, tersedia)
    private static boolean ramValid(int ram){
        return ram == 4 || ram == 8 || ram == 16 || ram == 32;
    }

    public Laptop(String kodeAset, String merk, int ramGB) {
        // TODO: validasi parameter, lalu isi atribut. Laptop baru selalu tersedia.
        if (kodeAset == null || !kodeAset.startsWith("LP-")) {
            throw new IllegalArgumentException("Kode aset harus diawali 'LP-'");
        }
        if ( merk == null || merk.isBlank() ) {
            throw new IllegalArgumentException("Merk tidak boleh kosong");
        }
        if (!ramValid(ramGB)) {
            throw new IllegalArgumentException("RAM harus 4, 8, 16, atau 32 GB");
        }
        this.kodeAset = kodeAset;
        this.merk = merk;
        this.ramGB = ramGB;
        this.tersedia = true;
       //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public String getKodeAset() {
        return kodeAset;
        // TODO
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public String getMerk() {
        return merk;
        // TODO
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public int getRamGB() {
        return ramGB;
        // TODO
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public boolean isTersedia() {
        return tersedia;
        // TODO
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public void upgradeRam(int ramBaru) {
        // TODO
        if (!ramValid(ramBaru) || ramBaru <= ramGB) {
            throw new IllegalArgumentException("RAM baru tidak valid atau tidak lebih besar dari ram sekarang");
        }
        ramGB = ramBaru;
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public boolean pinjam() {
        // TODO
        if (!tersedia) {
            return false;
        }
        tersedia = false;
        return true;
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public void kembalikan() {
        // TODO
        if (tersedia) {
            throw new IllegalStateException("Laptop tidak sedang dipinjam");
        }
        tersedia = true;
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }

    public String info() {
        // TODO
        return kodeAset + " | " + merk + " | " + ramGB + " GB | " + (tersedia ? "tersedia" : "dipinjam");
        //throw new UnsupportedOperationException("Belum diimplementasikan");
    }
}
