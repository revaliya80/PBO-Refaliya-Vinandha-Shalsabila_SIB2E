package JOBSHEET9;

public class TV extends AlatElektronik implements Audible{
    public String jenisLayar;
    public int volume;

    @Override
    public void naikkanVolume() {
       volume += 1;
    }
    @Override
    public void turunkanVolume() {
       volume -= 1;
    }

    public String getInfo() {
    return "Merk: " + merk +
           "\nWarna: " + warna +
           "\nHarga: " + harga +
           "\nJenis Layar: " + jenisLayar +
           "\nVolume: " + volume;
    }
}