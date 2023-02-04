package Week2;

import java.math.BigInteger;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");  
        System.out.print("Input:");
        String type[] = { "byte", "short", "int", "long" };
        try (Scanner input = new Scanner(System.in)) {
            int iteration = input.nextInt();
            BigInteger[] number = new BigInteger[iteration];
            int compare[] = new int[8];
            Boolean[] isFitted = new Boolean[iteration];

            // Range dari byte
            Long byte1 = -128L;
            Long byte2 = 127L;

            // Range dari short
            Long short1 = -32768L;
            Long short2 = 32767L;

            // Range dari int
            Long int1 = -2147483648L;
            Long int2 = 2147483647L;

            // Range dari long
            Long long1 = -9223372036854775808L;
            Long long2 = 9223372036854775807L;

            // Convert range menjadi big integer
            BigInteger range[] = new BigInteger[8];
            range[0] = BigInteger.valueOf(byte1);
            range[1] = BigInteger.valueOf(byte2);
            range[2] = BigInteger.valueOf(short1);
            range[3] = BigInteger.valueOf(short2);
            range[4] = BigInteger.valueOf(int1);
            range[5] = BigInteger.valueOf(int2);
            range[6] = BigInteger.valueOf(long1);
            range[7] = BigInteger.valueOf(long2);

            // Input number
            for (int i = 0; i < iteration; i++) {
                number[i] = input.nextBigInteger();
            }
            System.out.println("");

            // Membandingkan angka dengan range
            for (int i = 0; i < iteration; i++) {
                for (int j = 0; j < 8; j++) {
                    // Menghasilkan -1 jika number[i] < range, 0 jika number[i] = range, 1 jika
                    // number[i] > range
                    compare[j] = number[i].compareTo(range[j]);

                    if (compare[6] == 1 && compare[7] == -1) {
                        isFitted[i] = true;
                        // Hanya true di sini karena angka apapun akan masuk ke long, jika tidak masuk
                        // long, maka tidak bisa masuk ke tipe apapun
                    } else {
                        isFitted[i] = false;
                    }
                }

                System.out.print(number[i]);
                if (isFitted[i] == true) {
                    System.out.println(" can be fitted in:");
                }
                if (isFitted[i] == false) {
                    System.out.println(" can't be fitted anywhere.");
                }
                if (compare[0] == 1 && compare[1] == -1) {
                    System.out.println("* " + type[0]);
                }
                if (compare[2] == 1 && compare[3] == -1) {
                    System.out.println("* " + type[1]);
                }
                if (compare[4] == 1 && compare[5] == -1) {
                    System.out.println("* " + type[2]);
                }
                if (compare[6] == 1 && compare[7] == -1) {
                    System.out.println("* " + type[3]);
                }

            }
        }
    }
}