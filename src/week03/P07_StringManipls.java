package week03;

import java.util.Scanner;

public class P07_StringManipls {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);

        /*
        1-Kullanicidan isim ve soyismini ayri ayri alin.
        ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.

         */

        System.out.print("Lütfen İsminizi Giriniz: ");
        String name= scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz: ");
        String surname= scan.nextLine();
        if (name.length()>surname.length()){
            name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
            surname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
            System.out.println(name +" "+surname);

        }
        if(name.length()<surname.length()){
            name=name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
            //name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
            surname=surname.toUpperCase();
            System.out.println(name+" "+surname);

        }
    }
}
