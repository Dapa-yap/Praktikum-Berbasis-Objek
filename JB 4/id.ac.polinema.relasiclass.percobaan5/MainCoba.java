public class MainCoba {
    public static void main(String[] args) {
        // Mesin diciptakan sendiri secara mandiri di luar Mobil
        Mesin mesinAvanza = new Mesin(); 
        
        // Mesin dimasukkan (diinjeksikan) ke dalam Mobil
        MobilCoba mobil = new MobilCoba("Avanza", mesinAvanza); 
    }
}