public class MainPercobaan4 {
    public static void main(String[]args){
        Penumpang p = new Penumpang("12345", "Mr.Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(1, p);
        System.out.println(gerbong.info());
    }
}
