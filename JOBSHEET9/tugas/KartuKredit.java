package JOBSHEET9.tugas;

public class KartuKredit implements MetodePembayaran {

    private double limitKredit;
    private double tagihan;

    public KartuKredit(double limitKredit) {
        this.limitKredit = limitKredit;
        this.tagihan = 0;
    }

    @Override
    public boolean bayar(double jumlah) {

        if (jumlah > 0 && tagihan + jumlah <= limitKredit) {
            tagihan += jumlah;
            System.out.println("Pembayaran kartu kredit berhasil.");
            return true;
        } else {
            System.out.println("Pembayaran kartu kredit gagal.");
            return false;
        }
    }

    public void bayarTagihan() {

        if (tagihan > 0) {
            System.out.println("Tagihan sebesar Rp" + tagihan + " berhasil dibayar.");
            tagihan = 0;
        } else {
            System.out.println("Tidak ada tagihan yang harus dibayar.");
        }
    }
}