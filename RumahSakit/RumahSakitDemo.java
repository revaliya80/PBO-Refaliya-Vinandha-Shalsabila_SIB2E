import java.time.LocalDate;

public class RumahSakitDemo {
    public static void main (String[] args) {
        Pegawai ani = new Pegawai("456", "dr. Ani");
        Pegawai bagus = new Pegawai("457", "dr. Bagus");

        Pegawai desi = new Pegawai("1234", "Ns. Desi");
        Pegawai eka = new Pegawai("4567", "Ns. Eka");

        Pasien pasien1 = new Pasien("34328", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 9), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien pasien2 = new Pasien("99744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}