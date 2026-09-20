import java.util.Scanner;
public class TestLogistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kontainer kontainer = new Kontainer("KNT-001", "PT. Logistik Jaya", 1000.0);
        boolean berjalan = true;
        System.out.println("=== Sistem Manajemen Kargo Crane ===");
        System.out.println("Kapasitas Maksimal: " + kontainer.getKapasitasMaksimal() + " kg");
        while (berjalan) {
            System.out.println("\nMuatan Saat Ini: " + kontainer.getBeratMuatanSaatIni() + " kg");
            System.out.println("Pilih Aksi:");
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Turunkan Muatan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1/2/3): "); 
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan berat muatan yang ingin ditambahkan (kg): ");
                    double beratTambah = input.nextDouble();
                    kontainer.tambahMuatan(beratTambah);
                    break;
                case 2:
                    System.out.print("Masukkan berat muatan yang ingin diturunkan (kg): ");
                    double beratTurun = input.nextDouble();
                    kontainer.turunkanMuatan(beratTurun);
                    break;
                case 3:
                    System.out.println("Menutup sistem operasional crane. Terima kasih.");
                    berjalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }        
        input.close();
    }
}