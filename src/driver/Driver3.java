import java.util.Scanner;

class Laundry {

    String nama;
    double berat;
    String kodeLayanan;
    int hargaPerKg;
    double totalBayar;

    Laundry(String nama, double berat, String kodeLayanan) {
        this.nama = nama;
        this.berat = berat;
        this.kodeLayanan = kodeLayanan;
        setHarga();
        hitungTotal();
    }

    void setHarga() {
        if (kodeLayanan.equals("C")) {
            hargaPerKg = 5000;
        } else if (kodeLayanan.equals("CK")) {
            hargaPerKg = 7000;
        } else if (kodeLayanan.equals("CS")) {
            hargaPerKg = 10000;
        } else {
            hargaPerKg = 0;
        }
    }

    void hitungTotal() {
        totalBayar = berat * hargaPerKg;
    }

    void tampilkanData() {
        System.out.println("Nama        : " + nama);
        System.out.println("Berat       : " + berat + " kg");
        System.out.println("Layanan     : " + kodeLayanan);
        System.out.println("Total Bayar : Rp " + totalBayar);
        System.out.println("----------------------------------");
    }
}

public class Driver3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pelanggan: ");
        int n = Integer.parseInt(input.nextLine());

        Laundry[] dataLaundry = new Laundry[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nPelanggan ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Berat (kg): ");
            double berat = Double.parseDouble(input.nextLine());

            System.out.print("Kode Layanan (C/CK/CS): ");
            String kode = input.nextLine();

            dataLaundry[i] = new Laundry(nama, berat, kode);
        }

        System.out.println("\n===== DATA TRANSAKSI LAUNDRY =====");

        for (int i = 0; i < n; i++) {
            dataLaundry[i].tampilkanData();
        }
    }
}

