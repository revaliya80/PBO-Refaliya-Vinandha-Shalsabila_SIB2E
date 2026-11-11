package JOBSHEET9;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    public String getInfo() {
    return "Merk: " + merk +
           "\nWarna: " + warna +
           "\nHarga: " + harga +
           "\nJumlah Pintu: " + jumlahPintu;
    }
}
