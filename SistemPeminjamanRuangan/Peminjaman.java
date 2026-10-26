import java.time.LocalDate;

public class Peminjaman {
    private String idPeminjaman;
    private LocalDate tanggal;
    private String jam;
    private String status;

    private Mahasiswa mahasiswa;
    private Ruangan ruangan;

    public Peminjaman(String idPeminjaman, LocalDate tanggal,
        String jam, Mahasiswa mahasiswa, Ruangan ruangan) {
        this.idPeminjaman = idPeminjaman;
        this.tanggal = tanggal;
        this.jam = jam;
        this.mahasiswa = mahasiswa;
        this.ruangan = ruangan;
        this.status = "Belum diajukan";
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void ajukanPeminjaman() {
        if (ruangan.cekKetersediaan()) {
            status = "Diajukan";
            System.out.println("Peminjaman berhasil diajukan!");
        } else {
            System.out.println("Ruangan tidak tersedia!");
        }
    }

    public void batalkanPeminjaman() {
        status = "Dibatalkan";
        System.out.println("Peminjaman berhasil dibatalkan.");
    }

    public void ubahStatus(String statusBaru) {
        if (statusBaru.equalsIgnoreCase("Disetujui")) {
            status = "Disetujui";
        } else if (statusBaru.equalsIgnoreCase("Ditolak")) {
            status = "Ditolak";
        } else if (statusBaru.equalsIgnoreCase("Diajukan")) {
            status = "Diajukan";
        } else {
            System.out.println("Status tidak valid!");
        }
    }

    public void tampilInfoPeminjaman() {
        System.out.println("\n===== DETAIL PEMINJAMAN =====");
        System.out.println("ID Peminjaman : " + idPeminjaman);

        mahasiswa.lihatDataMahasiswa();

        System.out.println("\nInformasi Ruangan:");
        ruangan.tampilInfoRuangan();

        System.out.println("\nTanggal       : " + tanggal);
        System.out.println("Jam           : " + jam);
        System.out.println("Status        : " + status);
    }
}