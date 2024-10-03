import java.util.Scanner;
public class Pemilihan2Percobaan319 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input19.nextLine();
        System.out.print("Masukkan besarnya penghasilan: ");
        penghasilan = input19.nextInt();

        if (kategori.equalsIgnoreCase("pekerjaan")) {
            if (penghasilan <= 2000000) {
                pajak = 0.15;
            }else{
                pajak = 0.20;
            }
            gajiBersih = (int) (penghasilan - (pajak *  penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        }else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            }else if (penghasilan <= 3500000) {
                pajak = 0.2;
            }else{
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak *  penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        }else{
            System.out.println("Masukan Kategori Salah");
        }
    }
}
