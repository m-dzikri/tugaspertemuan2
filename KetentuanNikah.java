package ketentuannikah; //folder yang berisi sekumpulan program java

import java.util.Scanner; //impor class scanner

public class KetentuanNikah {
    public static void main(String[] args) { //menyimpan nilai argumen
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input uang tabungan
        System.out.print("Masukkan jumlah uang tabungan: ");
        double tabungan = scanner.nextDouble();

        // Input status calon pasangan
        System.out.print("Sudah memiliki calon pasangan? (ya/tidak): ");
        String statusPasangan = scanner.next().toLowerCase(); // Mengonversi input ke huruf kecil

        // Proses keputusan nikah
        if (tabungan > 100000000 && statusPasangan.equals("ya")) {
            System.out.println("Selamat! Anda bisa menikah karena uang "
                    + "tabungan lebih dari 100jt dan sudah punya calon pasangan.");
        } else if (tabungan <= 100000000) {
            System.out.println("Maaf, belum bisa menikah karena uang tabungan "
                    + "tidak lebih dari 100jt.");
        } else if (statusPasangan.equals("tidak")) {
            System.out.println("Maaf, belum bisa menikah karena belum memiliki "
                    + "calon pasangan.");
        } else {
            System.out.println("Maaf, input tidak valid. Silakan masukkan 'ya' "
                    + "jika sudah memiliki pasangan atau 'tidak' jika belum.");
        }

        // Menutup Scanner untuk menghindari resource leak
        scanner.close();
    }
}
