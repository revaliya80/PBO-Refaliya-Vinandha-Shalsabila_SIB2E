package DEMOUTS;

public class Dosen extends pegawai {
    public String nidn;

    public Dosen() {
        super();
        this.nidn = "-";
    }

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
             + "NIDN  : " + nidn;
    }
}
