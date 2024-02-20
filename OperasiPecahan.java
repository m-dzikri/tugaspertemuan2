package operasipecahan; //folder yang berisi sekumpulan program java

import java.util.Scanner; //impor class scanner

public class OperasiPecahan {
    public static void main(String[] args) { //menyimpan nilai argumen
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menerima inputan pertama
        System.out.print("Masukkan pecahan pertama: ");
        double pecahan1 = scanner.nextDouble();

        // Menerima inputan kedua
        System.out.print("Masukkan pecahan kedua: ");
        double pecahan2 = scanner.nextDouble();

        // Menerima inputan ketiga
        System.out.print("Masukkan pecahan ketiga: ");
        double pecahan3 = scanner.nextDouble();

        // Menampilkan hasil operasi tambah
        double hasilTambah = pecahan1 + pecahan2 + pecahan3;
        System.out.println("Hasil Penjumlahan: " + hasilTambah);

        // Menampilkan hasil operasi kurang
        double hasilKurang = pecahan1 - pecahan2 - pecahan3;
        System.out.println("Hasil Pengurangan: " + hasilKurang);

        // Menampilkan hasil operasi kali
        double hasilKali = pecahan1 * pecahan2 * pecahan3;
        System.out.println("Hasil Perkalian: " + hasilKali);

        // Menampilkan hasil operasi bagi
        if (pecahan2 != 0 && pecahan3 != 0) {
            double hasilBagi = pecahan1 / pecahan2 / pecahan3;
            System.out.println("Hasil Pembagian: " + hasilBagi);
        } else {
            System.out.println("Pembagian tidak dapat dilakukan karena "
                    + "salah satu bilangan adalah nol.");
        }
        
        scanner.close(); //Menutup Scanner untuk menghindari resource leak
    }
}
