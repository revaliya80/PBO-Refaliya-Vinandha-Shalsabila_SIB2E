
package DEMOUTS;

public class pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public pegawai() {
        this.nip = "-";
        this.nama = "-";
        this.gaji = 0;
    }

    public pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo() {
        return "NIP   : " + nip + "\n"
             + "Nama  : " + nama + "\n"
             + "Gaji  : Rp" + gaji;
    }

    public double tampilGaji() {
        return gaji;
    }
}
