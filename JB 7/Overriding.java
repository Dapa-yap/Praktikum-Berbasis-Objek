class Manusia {
    public void bernafas(){
        System.out.println("Manusia bisa bernafas");
    }
    public void makan(){
        System.out.println("Manusia bisa makan");
    }
}
class Dosen extends Manusia{
    @Override
    public void bernafas(){
        System.out.println("Dosen bisa bernafas");
    }
    public void makan(){
        System.out.println("Dosen bisa makan");
    }
    public void lembur(){
        System.out.println("Dosen bisa lembur");
    }
}
class Mahasiswa extends Manusia{
    @Override
    public void bernafas(){
        System.out.println("Mahasiswa bisa bernafas");
    }
    public void makan(){
        System.out.println("Mahasiswa bisa makan");
    }
    public void tidur(){
        System.out.println("Mahasiswa bisa tidur");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Manusia m;
        m = new Manusia();
        m.bernafas();
        m.makan();
        System.out.println();
        m = new Dosen();
        m.bernafas();
        m.makan();
        ((Dosen) m).lembur();
        System.out.println();
        m = new Mahasiswa();
        m.bernafas();
        m.makan();
        ((Mahasiswa) m).tidur();
    }
}
