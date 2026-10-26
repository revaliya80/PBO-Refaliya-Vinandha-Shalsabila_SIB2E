
package Jobsheet7;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        System.out.println("Objek dari class Pegawai dibuat");
    }

    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo() {
        return "NIP : " + nip + "\n"
             + "Nama : " + nama + "\n"
             + "Gaji : " + gaji + "\n";
    }
}
