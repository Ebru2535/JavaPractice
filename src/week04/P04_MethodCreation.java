package week04;

import java.util.Scanner;

public class P04_MethodCreation {
     /*
    Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
    bolenleri sayisini bulup bize donduren bir method olusturun.
    */
     public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.println("lütfen bir tamsayı giriniz");
         int sayi= scan.nextInt();

         System.out.println(tambölenlerinSayisi(sayi));
     }

   public static int tambölenlerinSayisi(int sayi) {
         int toplam=0;
       for (int i = 1; i <= sayi; i++) {
           if(sayi%i==0){
               toplam++;
           }


       }return toplam;
    }
}
