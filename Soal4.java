package Week2;

public class Soal4 {
        public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        double x = 92.98; 
        int nx = (int) Math.round(x);
        System.out.println(nx);
        }
}
//1. nilai nx setelah menggunakan Math.round(x) menjadi bulat keatas, karena lebih dekat dibulatkan keatas
//Intinya Math.round(x) berfungsi sebagai pembulatan sebuah nilai 

//2. Membutuhkan casting supaya nilai akhir bernilai integer