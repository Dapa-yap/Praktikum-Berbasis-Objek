public class Laptop {
    private String merk;
    // Printer sekarang disimpan sebagai atribut
    private Printer printerDefault; 
    
    public Laptop(String merk) {
        this.merk = merk;
    }

    // Diisi lewat setter (menunjukkan Aggregation karena diisi dari luar)
    public void setPrinter(Printer printer){
        this.printerDefault = printer;
    }

    // Parameter Printer dihilangkan, sekarang menggunakan atribut printerDefault
    public void cetakDokumen(String namaFile){
        if (this.printerDefault != null) {
            System.out.println(merk + " Mengirim dokumen ke printer...");
            this.printerDefault.cetak(namaFile);
        } else {
            System.out.println(merk + " tidak terhubung ke printer manapun!");
        }
    }
}