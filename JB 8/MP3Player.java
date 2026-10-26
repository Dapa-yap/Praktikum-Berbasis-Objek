public class MP3Player implements ChargeAble {
    private int storageCapacity;

    public void playMusic(String fileName) {
        System.out.println("Memutar Lagu: " + fileName);
    }
    @Override 
    public void doCharge() {
        System.out.println("Mengisi daya MP3 Player");
    }
  
}
