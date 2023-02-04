package Week2;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");
        Scanner Keyboard = new Scanner(System.in);
        String Kata1 = Keyboard.nextLine();
        String Kata2 = Keyboard.nextLine();
        String Final1, Final2;
        Keyboard.close(); 
        int Sum = Kata1.length() + Kata2.length();
        System.out.println("\nResult:");
        System.out.println(Sum);
        int Lexical= Kata1.compareTo(Kata2);
        if(Lexical>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        Final1 = Kata1.substring(0, 1).toUpperCase() + Kata1.substring(1);
        Final2 = Kata2.substring(0, 1).toUpperCase() + Kata2.substring(1);
        System.out.println(Final1 + " " + Final2);
    }
}
