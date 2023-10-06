import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan jenis kendaraan
        System.out.print("Masukkan jenis kendaraan (motor/mobil): ");
        String jenisKendaraan = input.nextLine();
        
        // Meminta pengguna memasukkan lama waktu parkir dalam jam
        System.out.print("Masukkan lama waktu parkir (jam): ");
        int lamaParkir = input.nextInt();
        
        // Menentukan tarif berdasarkan jenis kendaraan
        int tarifPerJam;
        if (jenisKendaraan.equalsIgnoreCase("motor")) {
            tarifPerJam = 3000;
        } else if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            tarifPerJam = 5000;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            return;
        }
        
        // Menghitung biaya parkir
        int biayaParkir = tarifPerJam * lamaParkir;
        
        // Menampilkan hasil perhitungan
        System.out.println("Biaya parkir untuk " + jenisKendaraan + " selama " + lamaParkir + " jam adalah Rp " + biayaParkir);
    }
}