import java.util.Scanner;

public class SiakadFor02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah =100;
        int totalLulus = 0, totalTidakLulus = 0;

        for(int i = 1; i<= 10; i++) {
            System.out.print("Masukkkan nilai mahasiswa ke-" +i+ ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
           if (nilai < terendah) {
            terendah = nilai;
            }
            if (nilai >= 60) {
                totalTidakLulus++;
            }else{
                totalLulus++;
            }
        }    
        System.out.println("Nilai tertinggi            : " + tertinggi);
        System.out.println("Nilai terendah             : " + terendah);
        System.out.println("Mahasiswa yang lulus       : " + totalLulus);
        System.out.println("Mahasiswa yang tidak lulus : " + totalTidakLulus);
    }
}