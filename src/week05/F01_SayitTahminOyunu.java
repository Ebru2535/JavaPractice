package week05;

import java.util.Scanner;

public class F01_SayitTahminOyunu {

      /*
    Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
    Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
    bitince de tebrik edip durduran bir kod yazalim
     */
    public static void main(String[] args) {

        int sayi=55;
        System.out.println("BİR SAYI TAHMİN ET");
        Scanner scan= new Scanner(System.in);
        boolean deger= false;
        while (!deger){

            int tahminEdilenSayi= scan.nextInt();

         if(tahminEdilenSayi<sayi){
             System.out.println("Dusuk soyledin arttir");
            } else if (tahminEdilenSayi>sayi) {
             System.out.println("Cok soyledin dusur");

         } else if (tahminEdilenSayi==sayi) {
             System.out.println("Tebrikler, sayıyı buldunuz");
         }else {
             deger=false;
             
         }
        }
    }
}
