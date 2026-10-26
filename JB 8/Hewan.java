public abstract class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama){
        this.nama = nama;
    }
    public void tambahUmur(){
        umur ++;
        System.out.println(nama + "berumur" + umur + "");
    }
    public abstract void bergerak();

}
    class Bebek extends Hewan{
        public Bebek(String nama){
            super(nama);
        }
        @Override 
        public void bergerak(){
            System.out.println("berjalan menggunakan kaki");
        }
    public static void main(String[] args) {
        Bebek b =  new Bebek("bebek");
        b.bergerak();
    }

    }
