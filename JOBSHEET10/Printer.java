package JOBSHEET10;

public class Printer {
    public void cetak (Printable printable) {
        System.out.println("Memeriksa ketersediaan tinta");
        System.out.println("Memeriksa ketersediaankertas");
        System.out.println("Mencetak..." + printable.getPrintableContent());
        System.out.println("Percetakan selesai.");
    }
}
