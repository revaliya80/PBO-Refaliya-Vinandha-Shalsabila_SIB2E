package Jobsheet2;

public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;

    public void displayInfo(){
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Status Mesin: "+ (this.statusMesin ? "on" : "off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("============================");
    }

    public String getPlatNomor() {
        return this.platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    // Getter and Setter for statusMesin
    public boolean StatusMesin() {
        return this.statusMesin;
    }

    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    // Getter and Setter for kecepatan
    public int getKecepatan() {
        return this.kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            this.kecepatan = kecepatan;
        }
    }
}
