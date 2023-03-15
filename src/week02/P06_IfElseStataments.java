package week02;

import java.util.Scanner;

public class P06_IfElseStataments {
    public static void main(String[] args) {
          /*
    1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
        85-100 -----> AA
        80-85 ------> BA
        75-80 ------> BB
        65-75 ------> CB
        50-65 ------> CC
        50 Altı ise  ------> FF
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        int not = scan.nextInt();
        if (not >= 85 && not <= 100) {
            System.out.println("notunuz :" + not + " AA");
        } else if (not >= 80 && not <= 85) {
            System.out.println("notunuz :" + not + " BA");
        } else if (not >= 75 && not <= 80) {
            System.out.println("notunuz :" + not + " BB");
        } else if (not >= 65 && not <= 75) {
            System.out.println("notunuz :" + not + " CB");
        } else if (not >= 50 && not <= 65) {
            System.out.println("notunuz :" + not + " CC");
        } else {
            System.out.println("notunuz FF");
        }

        /*
    Not: Birden fazla if,elseif, else durumlarında en son adıma bakılır
    else ile bitiyorsa tüm ihtimaller kapsanır.
    else if ile bitiyorsa kapsanmayan ihtimaller vardır.
     */
     /*
       2- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
          sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
          “istediginiz birim sisteme kayitli degil” yazdirin.
         */

        System.out.println("lütfen mesafeyi km olaaak giriniz ");
        double km = scan.nextDouble();
        System.out.println("lütfen döüştürmke istediğiniz birimi giriniz");
        char birim = scan.next().charAt(0);
        if (birim == 'm' || birim == 'M') {
            System.out.println("Girdiğiniz mesafenin metrre değeri :" + km * 1000 + "dir");
        } else if (birim == 's' || birim == 'S') {
            System.out.println("Giediğiniz mesafenin santimetr değeri :" + km * 1000 * 1000 + "dir");
        } else {
            System.out.println("“istediginiz birim sisteme kayitli degil”");
        }

        // kullanıcıdan artık yıl olup olmadığını kontrol edin
        //kural 1 :4 ile bölünemeyen yıllar artık yıl değildir
        //kural 2 :4 ile bölünüp 100 ile bölünemeyen yıllar  artık yıldır
        //        :4 un katı olmasına ragmen 100 ile bölünebilen yollardan ssadece 400 un katı olan yıllar artık yıldır


        System.out.println("lütfen kontrol etmek istediğiniz yılı giriniz");
        int yıl = scan.nextInt();
        if (yıl % 100 == 0 && yıl % 400 == 0 || yıl % 100 != 0 && yıl % 4 == 0) {
            System.out.println("artık yıldır");
        }else {
            System.out.println("artık yıl değildir");
        }
    }
}