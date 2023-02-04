package Week2;

public class Soal3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        final double CM_PER_INCH = 2.54;                    // Nilai dari variabel CM_PER_INCH tidak akan bisa diubah
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }

    // public static final double CM_PER_INCH = 2.54;       // Nilai dari CM_PER_INCH akan sama untuk setiap instance dari sebuah kelas, dan tidak bisa diubah
    // public static void main(String[] args) {
    // double paperWidth = 8.5;
    // double paperHeight = 11;
    // System.out.println("Paper size in centimeters: " + paperWidth *CM_PER_INCH +
    // " by " + paperHeight * CM_PER_INCH);
    // }
}
