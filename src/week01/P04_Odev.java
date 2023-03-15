package week01;

import java.util.Scanner;

public class P04_Odev {
    public static void main(String[] args) {

/*
        ÖDEV : Aşağıdaki gibi bir ATM karşılama ekranı yazan koda dizisini yazınız.
        ****    WISE BANK   ****
        WISE ATM’YE HOŞGELDİNİZ
        1 – Bakiye Sorgulama
        2 – Para Yatırma
        3 – Para Çekme
        4 – Bilgi Güncelleme
        5 – Kart İade
       ****    WISE BANK   ****

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("WİSA ATM ye HOSGELDINIZ");
        System.out.println("lütfen şifrenizi giriniz");
        int num = scan.nextInt();
        System.out.println("1- Bakiye sorgulama");
        System.out.println("2- Para Yatırma");
        System.out.println("3- Para Cekme");
        System.out.println("4- Bilgi Güncelleme");
        System.out.println("5- Kart İade");
        System.out.println("***   wisa bank  ***");


    }
}
