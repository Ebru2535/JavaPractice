package week02;

import java.util.Scanner;

public class P03_DataCasting {
    public static void main(String[] args) {

      /*
           1-Int olarak verilen 3 sayının toplamını double olarak yazdırın
      ipucu: double>float>long>int>short>byte
        */
        int a=3, b=7, c=9;
        double toplam= (a+b+c);
        System.out.println("toplam:"+toplam); // 19.0


        /*
     2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
    Girdiğiniz harf :
    Girdiğiniz harften sonraki  3 harf :
       şeklinde yazdrın.
      ipucu: char
    */
        Scanner scan= new Scanner(System.in);
        System.out.print("lütfen bir harf giriniz");
         char harf= scan.next().charAt(0);
        System.out.println("Girdiğiniz harf:"+harf);
        System.out.println("Girdiğiniz harften sonraki üç harf:"+(char)(harf+1)+","+
                (char)(harf+2)+","+(char)(harf+3)+"'dir");

        /*
     3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
          sonucu tam sayı yazdırın
           ipucu: sorumluluk bende
 */
        System.out.println("lütfen iki tane ondalıklı sayı giriniz");
        double sayı1= scan.nextDouble();
        double sayı2= scan.nextDouble();
       int toplam1=(int) (sayı1/sayı2);
        System.out.println(toplam1);
    }
}
