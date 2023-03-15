package week03;

import java.util.Scanner;

public class P06_Swich {
    public static void main(String[] args) {


       /*
        4-Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın
         */
        Scanner scan= new Scanner(System.in);
        System.out.print(" Bilgi istediğiniz yılı giriniz: ");
    int year = scan.nextInt();
        System.out.print(" Gün sayısını merak ettiğiniz ayın kaçıncı ay olduğunu giriniz: ");
    int ayNum = scan.nextInt();

    int numdays = 0;

        switch (ayNum) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            numdays = 31;
            System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + numdays);
            break;


        case 4:
        case 6:
        case 9:
        case 11:
            numdays = 30;
            System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + numdays);
            break;
        case 2:
            numdays = ((year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) ? 29 : 28);
            System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + numdays);
            break;
        default:
            System.out.println("Geçersiz ay");

    }



}}
