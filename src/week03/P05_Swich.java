package week03;

import java.util.Scanner;

public class P05_Swich {
    public static void main(String[] args) {
         /*
    3-Kullanicidan ay numarasini alip mevsimi yazdirin.
      */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen ay no giriniz");
        int ay= scan.nextInt();
        switch (ay){
            case 1:
            case 2:
            case 3:
                System.out.println("kış");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("sonbahr");
                break;
            default:
                System.out.println("yanlış no girdiniz");

        }
    }
}
