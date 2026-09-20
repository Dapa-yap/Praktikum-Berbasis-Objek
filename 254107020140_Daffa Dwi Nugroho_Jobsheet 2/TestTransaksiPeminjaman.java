public class TestTransaksiPeminjaman {
    public static void main(String[] args) {
        TransaksiPeminjaman t1 = new TransaksiPeminjaman();
        t1.idTransaksi = "T123";
        t1.namaPeminjam = "Ravy";
        t1.judulBuku = "Matematika dasar";
        t1.jumlahHariKeterlambatan = 0;
        
        TransaksiPeminjaman t2 = new TransaksiPeminjaman();
        t2.idTransaksi = "T124";
        t2.namaPeminjam = "Sanda";
        t2.judulBuku = "Metode Numerik";
        t2.jumlahHariKeterlambatan = 3;

        TransaksiPeminjaman t3 = new TransaksiPeminjaman();
        t3.idTransaksi = "T125";
        t3.namaPeminjam = "Rasan";
        t3.judulBuku = "Mat Num";
        t3.jumlahHariKeterlambatan = 10;
        System.out.println("=== Data Transaksi Peminjaman Buku ===\n");
        t1.tampilData();
        t2.tampilData();
        t3.tampilData();
    }
}