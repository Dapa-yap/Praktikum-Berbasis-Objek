public class MainPercobaan6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Thinkpad");
        Printer printer = new Printer("Epson L3110");   
        // Printer "ditanamkan" atau di-set ke dalam Laptop
        laptop.setPrinter(printer);
        laptop.cetakDokumen("Laporan.pdf");
    }
}