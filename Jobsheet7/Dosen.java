
package Jobsheet7;

public class Dosen extends Pegawai {
    public String nidn;

    // Constructor tanpa parameter
    public Dosen() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    // Constructor dengan parameter
    public Dosen(String nidn) {
        this.nidn = nidn;
    }

    public String getInfo() {
        return "NIDN : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
}
