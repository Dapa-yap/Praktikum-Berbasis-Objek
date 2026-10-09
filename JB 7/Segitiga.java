public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    public double keliling(int sisiA, int sisiB){
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return sisiA + sisiB + c;
    }
        public static void main(String[] args) {
        Segitiga s = new Segitiga();
 
        System.out.println("Sudut ketiga (1 sudut diketahui)  : " + s.totalSudut(90));
        System.out.println("Sudut ketiga (2 sudut diketahui)  : " + s.totalSudut(60, 50));
        System.out.println("Keliling (3 sisi)                 : " + s.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi, siku-siku)      : " + s.keliling(3, 4));
    }
    
}
