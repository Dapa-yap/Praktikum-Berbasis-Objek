public class testBuku {
   public static void main(String[] args) {
    Buku buku1 = new Buku();
    buku1.isbn = "978-979-29-6104-2";
    buku1.judul = "Dasar Pemrograman Berbasis Objek";
    buku1.penulis = "Abdul Kadir";
    buku1.tahunTerbit = 2021;
   try {
        buku1.tampilInfoBuku();
    } catch (Exception e) {
        System.out.println("Terjadi error");
    }
    Buku buku2 = new Buku();
    buku2.isbn = "978-979-29-6104-1";
    buku2.judul = "PBO";
    buku2.penulis = "Ravy";
    buku2.penerbit = "Andi sanda";
    buku2.tahunTerbit = 2020;
    buku2.tampilInfoBuku();

    Buku buku3 = new Buku();
    buku3.isbn = "978-979-29-6104-0";
    buku3.judul = "OOP";
    buku3.penulis = "SANDA";
    buku3.penerbit = "Andi ravy";
    buku3.tahunTerbit = 2023;
    buku3.tampilInfoBuku();
   } 
}
