import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        double harga = 20000, diskon = 0, jumlahDiskon, totalHargaBayar;
        String jenis;
        int jumlah;

        System.out.print("Masukkan jenis buku: ");
        jenis = input19.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlah = input19.nextInt();

        if (jenis.equalsIgnoreCase("kamus")) {
            System.out.println("Jenis buku: "+ jenis);
            if (jumlah > 2) {
                diskon += 0.12;
            } else {
                diskon += 0.10;
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            if (jumlah > 3) {
                diskon += 0.09;
            } else if (jumlah >= 1 && jumlah <= 3) {
                diskon += 0.08;
            } else {
                diskon += 0;
            }
        } else {
            if (jumlah > 3) {
                diskon += 0.05;
            }
        }

        jumlahDiskon = (harga * diskon) * jumlah;
        totalHargaBayar = (harga * jumlah) - jumlahDiskon;

        System.out.println(diskon);
        System.out.println("Jumlah diskon = " + jumlahDiskon);
        System.out.println("Total harga bayar = " + totalHargaBayar);
    }
}