package week01;

import java.util.Scanner;

public class P03_Variables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz :");
      String ad= scan.nextLine();
        System.out.println("lütfen soyadınızı giriniz");
        String soyad= scan.next();
        System.out.println("lütfen yasınızı giriniz");
        int yas= scan.nextInt();
        System.out.println("lütfen mail adresinizi giriniz");
        String mail= scan.next();
        System.out.println("lütfen şifrenizi giriniz");
        String sıfre= scan.next();

        System.out.println("kaydınız başarıyla oluşturulmuştur\n"+"Adınız:"+ad+"\n\tSoyadını :"+soyad+
               " \n\t yasını:" +yas+"\n\t maıl :"+ mail+"\n\t sıfre:"+sıfre);
    }
}
