import java.util.Scanner;

public class TugasTempatParkir02 {
    
    public static void main(String[] args) {
        int jenis, durasi, total = 0;
        Scanner sc = new Scanner(System.in);
        total = sc.nextInt();
       
        while (true) {
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor , 0. Batal)" );
            jenis = sc.nextInt();
            if (jenis==0) {
                break;
            }
            System.out.print("Masukkan durasi parkir ");
            durasi = sc.nextInt();

            int pembayaran = 0;
            if (durasi > 5) {
                pembayaran = 12500;
            }
            if (jenis == 1) {
                pembayaran = durasi * 3000;
            }else if (jenis == 2) {
                pembayaran = durasi * 2000;
            }else{
                System.out.print("Jenis kendaraan tidak benar. tolong masukkan jenis kendaraan dengan benar");
                continue;
            }
            total += pembayaran;
            System.out.println("Pembayaran untuk jenis kendaraan ini : rp " + pembayaran);
        }
        System.out.println("Total pembayaran parkir : Rp " + total);
    }
}