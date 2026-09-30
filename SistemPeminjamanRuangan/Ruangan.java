public class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;
    private int kapasitas;
    private boolean tersedia;

    public Ruangan(String kodeRuangan, String namaRuangan, int kapasitas) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
        this.tersedia = true;
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public void setKodeRuangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public boolean cekKetersediaan() {
        return tersedia;
    }

    public void tampilInfoRuangan() {
        System.out.println("Kode Ruangan : " + kodeRuangan);
        System.out.println("Nama Ruangan : " + namaRuangan);
        System.out.println("Kapasitas    : " + kapasitas + " orang");

        if (tersedia) {
            System.out.println("Ketersediaan : Tersedia");
        } else {
            System.out.println("Ketersediaan : Tidak tersedia");
        }
    }
}