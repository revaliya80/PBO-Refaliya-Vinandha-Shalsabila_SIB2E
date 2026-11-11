package JOBSHEET9.tugas;

public class DompetDigital implements MetodePembayaran {

    private double saldo;
    private String nomorHp;

    public DompetDigital(double saldo, String nomorHp) {
        this.saldo = saldo;
        this.nomorHp = nomorHp;
    }

    @Override
    public boolean bayar(double jumlah) {

        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pembayaran dompet digital berhasil.");
            return true;
        } else {
            System.out.println("Pembayaran dompet digital gagal.");
            return false;
        }
    }

    public void isiSaldo(double jumlah) {

        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Isi saldo berhasil.");
        } else {
            System.out.println("Jumlah isi saldo tidak valid.");
        }
    }
}