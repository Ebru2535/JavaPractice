package week02;

import java.util.Scanner;

public class P02_Scanner {
    public static void main(String[] args) {
        // üçgenin kenarı ve yuksekliğinı al
        //üçgenin alanı hesaplla
        int a=10;
        int b= 12;
        System.out.println("ücgenın alanı:"+(a*b/2));

        // kullanıcıdan iki sayı al, 3. değişken olmadan sayı değerlerini değiştir(Swap)
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki pozitif tamsayı giriniz");
        int sayı= scan.nextInt();
        int sayı1= scan.nextInt();
        

    }
}
