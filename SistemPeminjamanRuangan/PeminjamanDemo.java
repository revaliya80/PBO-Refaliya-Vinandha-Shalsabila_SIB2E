import java.time.LocalDate;

public class PeminjamanDemo {
    public static void main(String[] args) {

        // Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa(
            "234567",
            "Dani",
            "Sistem Informasi Bisnis"
        );

        // Membuat objek ruangan
        Ruangan ruangan1 = new Ruangan(
            "RT07",
            "Ruang Teori 07",
            50
        );

        // Membuat objek peminjaman
        Peminjaman peminjaman1 = new Peminjaman(
            "PJ001",
            LocalDate.of(2025, 9, 21),
            "18.00",
            mahasiswa1,
            ruangan1
        );

        // Menampilkan informasi ruangan
        System.out.println("===== INFORMASI RUANGAN =====");
        ruangan1.tampilInfoRuangan();

        // Mahasiswa mengajukan peminjaman
        mahasiswa1.ajukanPeminjaman(peminjaman1);

        // Menampilkan detail peminjaman
        peminjaman1.tampilInfoPeminjaman();

        // Mengubah status peminjaman
        peminjaman1.ubahStatus("Disetujui");

        System.out.println("\n===== STATUS TERBARU =====");
        System.out.println("Status Peminjaman: " + peminjaman1.getStatus());
    }
}