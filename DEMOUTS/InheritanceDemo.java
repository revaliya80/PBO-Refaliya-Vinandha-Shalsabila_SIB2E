package DEMOUTS;

public class InheritanceDemo {
  public static void main(String[] args) {

        dokter dokter1 = new dokter(
            "D001",
            "Andi Saputra",
            8000000,
            "Kardiologi"
        );

        Dosen dosen1 = new Dosen(
            "D002",
            "Budi Santoso",
            6500000,
            "123456789"
        );

        System.out.println("=== DATA DOKTER ===");
        System.out.println(dokter1.getInfo());
        System.out.println("Gaji Dokter: Rp" + dokter1.tampilGaji());

        System.out.println();

        System.out.println("=== DATA DOSEN ===");
        System.out.println(dosen1.getInfo());
        System.out.println("Gaji Dosen: Rp" + dosen1.tampilGaji());
    }
}
