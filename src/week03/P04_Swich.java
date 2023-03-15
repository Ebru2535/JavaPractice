package week03;

import java.util.Scanner;

public class P04_Swich {
    public static void main(String[] args) {
       //Kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("bilgi istediğiniz yılı giriniz");
        int ay= scan.nextInt();
       switch (ay){
           case 1:
               System.out.println("ocak");
               break;
           case 2:
               System.out.println("şubat");
               break;
           case 3:
               System.out.println("mart");
               break;
           case 4:
               System.out.println("nisan");
               break;
           case 5:
               System.out.println("mayıs");
               break;
           case 6:
               System.out.println("haziran");
               break;
           case 7:
               System.out.println("temmuz");
               break;
           case 8:
               System.out.println("agustos");
               break;
           case 9:
               System.out.println("eylül");
               break;
           case 10:
               System.out.println("ekim");
               break;
           case 11:
               System.out.println("kasım");
               break;
           case 12:
               System.out.println("aralık");
               break;
           default:
               System.out.println("yanlış ayno girdiniz");

       }

    }
}
