import java.util.Scanner;

public class KafeDoWhile02 {

    public static void main (String [] args){
        int kopi,teh,roti;
        String namaPelanggan;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.print("Transaksi di batalkan.");
                break;
            }
            System.out.print("Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh  : ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti : ");
            roti = sc.nextInt();
            double totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus di bayar : Rp " + totalHarga);
            sc.nextLine();
        }while (true);

        System.out.println("Semua transaksi sudah selsai.");
    }
}