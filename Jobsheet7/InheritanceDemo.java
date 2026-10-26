package Jobsheet7;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        System.out.println();

        Dosen dosen2 = new Dosen(
            "12345",
            "Reva",
            5000000,
            "67890"
        );

        System.out.println("\nData Dosen 2:");
        System.out.println(dosen2.getAllInfo());
    }
}
