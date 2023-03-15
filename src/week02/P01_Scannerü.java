package week02;

import java.util.Scanner;

public class P01_Scannerü {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen adınızı giiriniz");
        String name= scan.next();
        System.out.println("lütfen soyadınızı giriniz");
        String soyad= scan.next();
        System.out.println("lütfen yasınızı giriniz");
        int yas= scan.nextInt();
        System.out.println("lütfen mail adresinizi giriniz");
        String mail= scan.next();
        System.out.println("lütfen bir şifre giriniz");
        String sfre=scan.next();
        System.out.println("**********  KAYDINIZ BASARIYLA ALINMISIR  *******");
        System.out.println(        "Adınız :"+name
                                  +"\nSoyadınız:"+soyad
                                  +"\nYasınız :"+yas
                                  +"\nMail:"+mail
                                  +"\nSifreniz :"+sfre);

        System.out.println("============ SORU BİTTİ=========");
        System.out.println("KULLANICI :"+name.charAt(0)+","+soyad+","+yas);





    }
}
