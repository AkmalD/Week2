package Week2.Week2;

public class Soal5 {
        static short methodOne(long l) {
            int i = (int) l;
            return (short) i;
        }

        public static void main(String[] args) {
            System.out.print("\033[H\033[2J");
            double d = 10.25;
            float f = (float) d;
            byte b = (byte) methodOne((long) f);
            System.out.println(b);
        }
}
//1. Output nilai var b adalah 10 
//2. awalnya nilai bertipe double, lalu dicasting menjadi float, lalu diubah menjadi integer didalam method, dikembalikan sebagai short, lalu di casting menjadi byte
