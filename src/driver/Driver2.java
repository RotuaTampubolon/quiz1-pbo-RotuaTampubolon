import java.util.Scanner;

class KelompokNilai {

    private int[] nilai;

    public KelompokNilai(int[] nilai) {
        this.nilai = nilai;
    }

    public int hitungTotal(char kodeKelompok) {

        int total = 0;

        if (kodeKelompok == 'A') {
            // Kelompok A → posisi 1,3,5 (index 0,2,4)
            for (int i = 0; i < nilai.length; i += 2) {
                total += nilai[i];
            }
        } 
        else if (kodeKelompok == 'B') {
            // Kelompok B → posisi 2,4,6 (index 1,3,5)
            for (int i = 1; i < nilai.length; i += 2) {
                total += nilai[i];
            }
        }

        return total;
    }
}

public class Driver2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int N = Integer.parseInt(input.nextLine());

        int[] dataNilai = new int[N];

        System.out.println("Masukkan deret nilai:");
        for (int i = 0; i < N; i++) {
            dataNilai[i] = Integer.parseInt(input.nextLine());
        }

        System.out.print("Masukkan kode kelompok (A/B): ");
        char kode = input.nextLine().charAt(0);

        KelompokNilai kelompok = new KelompokNilai(dataNilai);

        int hasil = kelompok.hitungTotal(kode);

        System.out.println("Total nilai kelompok " + kode + " = " + hasil);
    }
}

 