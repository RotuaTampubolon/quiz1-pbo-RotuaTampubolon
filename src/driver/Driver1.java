import java.util.Scanner;

class Menu {
    String kode;
    String nama;
    int harga;

    Menu(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }
}

public class Driver1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Menu[] daftarMenu = {
                new Menu("NGS", "Nasi Goreng Spesial", 15000),
                new Menu("AP", "Ayam Penyet", 20000),
                new Menu("SA", "Sate Ayam", 25000),
                new Menu("BU", "Bakso Urat", 18000),
                new Menu("MAP", "Mie Ayam Pangsit", 15000),
                new Menu("GG", "Gado-Gado", 15000),
                new Menu("SAM", "Soto Ayam", 17000),
                new Menu("RD", "Rendang Daging", 25000),
                new Menu("IB", "Ikan Bakar", 35000),
                new Menu("NUK", "Nasi Uduk Komplit", 20000)
        };

        String kodeInput;
        int porsiButet;
        int totalPembayaran = 0;

        System.out.printf("%-25s %-10s %-10s %-10s\n",
                "Menu", "Porsi", "Harga", "Total");
        System.out.println("==========================================================");

        while (true) {

            kodeInput = input.nextLine();

            if (kodeInput.equals("END")) {
                break;
            }

            porsiButet = input.nextInt();
            input.nextLine();

            int porsiUcok = 2 * porsiButet;  // u = 2b
            int totalPorsi = porsiButet + porsiUcok;

            for (int i = 0; i < daftarMenu.length; i++) {

                if (kodeInput.equals(daftarMenu[i].kode)) {

                    int subtotal = daftarMenu[i].harga * totalPorsi;
                    totalPembayaran += subtotal;

                    System.out.printf("%-25s %-10d %-10d %-10d\n",
                            daftarMenu[i].nama,
                            totalPorsi,
                            daftarMenu[i].harga,
                            subtotal);
                }
            }
        }

        System.out.println("==========================================================");
        System.out.printf("%-47s %d\n", "Total Pembayaran", totalPembayaran);

        if (totalPembayaran >= 200000) {
            System.out.println("Kupon : Kuning");
        } else if (totalPembayaran >= 100000) {
            System.out.println("Kupon : Biru");
        }
    }
}
 