package kodeascii; //folder yang berisi sekumpulan program java

public class KodeAscii {
    public static void main(String[] args) {
        // Mendefinisikan karakter 'X' dan 'y'
        char charX = 'X';
        char charY = 'y';

        // Mengambil nilai ASCII dari karakter 'X' dan 'y'
        int asciiX = (int) charX;
        int asciiY = (int) charY;

        // Menjumlahkan nilai ASCII
        int hasilJumlah = asciiX + asciiY;

        // Menampilkan hasil
        System.out.println("ASCII dari karakter 'X': " + asciiX);
        System.out.println("ASCII dari karakter 'y': " + asciiY);
        System.out.println("Jumlah ASCII dari 'X' dan 'y': " + hasilJumlah);
    }
}
