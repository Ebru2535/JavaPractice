package week04;

import java.util.Scanner;

public class P02_Method {
    static String düzenliStr="";
     /*
    Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz");
        String name= scan.nextLine();
        System.out.println("lütfen soyadınızı giriniz");
        String surname= scan.nextLine();

        System.out.println(isimSoyisimyazdır(name, surname));

    }

    public static String isimSoyisimyazdır(String name, String surname) {
        name= name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
        surname= surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();

        düzenliStr=name+" "+surname;
        return düzenliStr;
    }
}
