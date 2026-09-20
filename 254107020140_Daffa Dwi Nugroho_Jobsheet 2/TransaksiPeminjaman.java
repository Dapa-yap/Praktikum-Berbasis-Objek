public class TransaksiPeminjaman{
    public String idTransaksi;
    public String namaPeminjam;
    public String judulBuku;
    public int jumlahHariKeterlambatan;
    public double tarifDenda = 1000.0;

    public double hitungDenda(){
        return jumlahHariKeterlambatan *tarifDenda;
    }
    public void tampilData(){
        System.out.println("Id Transaksi    :" + idTransaksi);
        System.out.println("Nama Peminjam :  " + namaPeminjam);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Jumlah Hari Keterlambatan "+ jumlahHariKeterlambatan);
        System.out.println("Denda yang harus dibayar ialah " + hitungDenda());
    }


}