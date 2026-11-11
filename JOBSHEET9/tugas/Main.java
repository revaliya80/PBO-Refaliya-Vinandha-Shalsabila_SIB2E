package JOBSHEET9.tugas;
public class Main {

    public static void main(String[] args) {

        // Membuat objek KartuKredit
        KartuKredit kartu = new KartuKredit(5000000);

        // Membuat objek DompetDigital
        DompetDigital dompet = new DompetDigital(
            1000000, "081234567890"
        );

        // Pengujian Kartu Kredit
        System.out.println("=== KARTU KREDIT ===");
        kartu.bayar(1500000);
        kartu.bayar(2000000);
        kartu.bayarTagihan();

        // Pengujian Dompet Digital
        System.out.println("\n=== DOMPET DIGITAL ===");
        dompet.bayar(250000);
        dompet.isiSaldo(500000);
        dompet.bayar(1000000);

    }
}   