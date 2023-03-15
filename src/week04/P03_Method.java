package week04;

import java.util.Scanner;

public class P03_Method {
      /*
    Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    sonuclarini donduren bir method olusturun.
     */
      public static void main(String[] args) {
          Scanner scanner= new Scanner(System.in);
          System.out.println("lütfen bir tamsayı giriniz");
          int sayi= scanner.nextInt();

          System.out.println( asalSayıKontrolEt(sayi));
      }


     public static String asalSayıKontrolEt(int sayi) {
         String sonuc = "sayı asal sayıdır";

         for (int i = 2; i < sayi; i++) {
             if (sayi % i == 0) {
                 sonuc = "asal sayı değildir";

             }}

             return sonuc;


         }


     }
