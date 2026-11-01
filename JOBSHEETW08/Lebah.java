package JOBSHEETW08;

public class Lebah extends Hewan {
    public String kasta;

    public Lebah (String kasta, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    @Override
    public void bergerak() {
        System.out.println("Otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirimkan oksigen");
        System.out.println("Otot perut berkontraksi, udara dikeluarkan");
    }

    @Override
    public void bernapas() {
        System.out.println("Mengepakkan sayap kedepan");
        System.out.println("Memutar perut berkontraksi, udara dikeluarkan");
        System.out.println("Mengepakkan sayap kebelakang");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kasta : " + this.kasta);
    }
}
