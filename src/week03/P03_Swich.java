package week03;

import java.awt.*;
import java.util.Scanner;

public class P03_Swich {
    public static void main(String[] args) {
        // kullanıcıdan 2 basamaklı bir sayı alıp girilen sayı yazı ile yazıdırn
        Scanner scan= new Scanner(System.in);
        System.out.println("lütefen iki basamaklı bir sayı griniz");
        int sayı= scan.nextInt();
        if(sayı>=10 && sayı<=99){
            int birler= sayı%10;
            int onlar= sayı/10;
            switch (onlar){
                case 1:
                System.out.println("on");
                break;
                case 2:
                    System.out.println("yirmi");
                    break;

            }switch (birler){
                case 0:
                    System.out.println(" ");
                    break;
                case 1:
                    System.out.print("bir ");
                    break;
                case 2:
                    System.out.print("iki ");
                    break;
                case 3:
                    System.out.print("üç ");
                    break;
                case 4:
                    System.out.print("dört ");
                    break;
                case 5:
                    System.out.println("beş ");
                    break;
                case 6:
                    System.out.print("altı ");
                    break;
                case 7:
                    System.out.print("yedi ");
                    break;
                case 8:
                    System.out.print("sekiz ");
                    break;
                case 9:
                    System.out.print("dokuz ");
                    break;

            }

        }else {
            System.out.println("lütfen iki basamaklı sayı giriniz");
        }
    }
}
