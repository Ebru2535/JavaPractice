package week03;

import java.util.Scanner;

public class P01_Ternary {
    public static void main(String[] args) {
        // 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //  "Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.

        // ternaty ile çözümü :
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen üçgenin 3 kenar uzunlugunu giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        System.out.println(kenar2>0 ? (kenar1==kenar2 && kenar2==kenar3 ? "Eşkenar üçgen ": "Eşkenar üçgen değil" ):"Yanlıs giriş yaptınız");

        // 2- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //harf olarak yazdirin, yoksa girilen harfi yazdirin

        System.out.println("lüten bir harf giriniz");
        char harf= scan.next().toUpperCase().charAt(0);
        System.out.println((harf >= 97 && harf <= 122) ? (char) (harf - 32) : harf);
        System.out.println(harf>='a'&& harf<='z'?(char)(harf-32):harf);
        System.out.println(harf>='a' && harf<='z'? Character.toUpperCase(harf):harf);

        System.out.println("harf = "+harf);

        // kullanıcıdan iki adet sayı isteyın ve byük olmaya sayı yazdırın
        System.out.println("lütfen iki sayı girin");
        System.out.print("1.sayı:");
        int a= scan.nextInt();
        System.out.print("2.sayı");
        int b= scan.nextInt();
        System.out.println(a>b ? " büyük olamayn sayı"+b : "büyük olmayan sayı:"+a);

        // kullanıcdan sayı alın 50 veya daha buyukse "sınfıı gectın", 50 den küçükse "malesef kaldın" yazdr

        System.out.println("lütfen notunuzu giriniz");

        double not= scan.nextDouble();
        System.out.println(not >= 50 ? "Sınıfı " + not + " ile gectıniz" : "malesef" + not + "ile kaldınız");
        System.out.println(not>=101 || not <=-1 ? "Yanlış not girdiniz" :not >= 50 ? "Geçtiniz" : "Maalesef Kaldınız");

    }
}


