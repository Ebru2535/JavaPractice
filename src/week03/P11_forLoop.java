package week03;

import java.util.Scanner;

public class P11_forLoop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String kelime= scan.nextLine();                   //
        String toplam="";                                // 2. yol

        for (int i = kelime.length(); i >=1; i--) {     // for(int i=kelime.lenght()-1; i>=0; i--)
                                                       //  toplam+=kelime.charAt(i);
            toplam+=kelime.substring(i-1,i);
        }

        System.out.println(toplam);
    }
}
