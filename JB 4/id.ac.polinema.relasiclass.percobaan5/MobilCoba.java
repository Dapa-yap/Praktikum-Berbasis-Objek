public class MobilCoba {
    private String merk;
    private Mesin mesin;

    // Constructor 1 (Composition)
    public MobilCoba(String merk){
        this.merk = merk;
        this.mesin = new Mesin(); 
    }

    // Constructor 2 baru (Aggregation)
    public MobilCoba(String merk, Mesin mesin) {
        this.merk = merk;
        this.mesin = mesin;
    }
    
}