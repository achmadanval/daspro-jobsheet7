import java.util.Scanner;

public class tugas1Tiket {
    
    public static void main(String[] args) {
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        int totalHargaPenjualan = 0;
        int jmlTiket;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jumlah tiket (atau -1 untuk keluar): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) { // validasi input
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan angka positif.");
                continue;
            }

            double hargaDiskon = hargaTiket;
            if (jmlTiket > 10) {
                hargaDiskon -= hargaDiskon * 0.15;
            } else if (jmlTiket > 4) {
                hargaDiskon -= hargaDiskon * 0.10;
            }
            int totalHarga = (int) (jmlTiket * hargaDiskon);
            totalTiketTerjual += jmlTiket;
            totalHargaPenjualan += totalHarga;

            System.out.printf("Total harga untuk %d tiket: Rp %d%n", jmlTiket, totalHarga);
            System.out.printf("%nTotal tiket terjual: %d%n", totalTiketTerjual);
            System.out.printf("Total penjualan: Rp %d%n", totalHargaPenjualan);
        }
    
    }
}
