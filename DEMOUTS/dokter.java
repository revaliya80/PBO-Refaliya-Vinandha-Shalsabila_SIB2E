
package DEMOUTS;

public class dokter extends pegawai {
    public String spesialist;

    public dokter() {
        this.spesialist = "-";
    }

    public dokter(String nip, String nama, double gaji, String spesialist) {
        super(nip, nama, gaji);
        this.spesialist = spesialist;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
             + "Spesialis : " + spesialist;
    }
}