package week05;

import java.util.Scanner;

public class AtmSorusu {
   static String kartNo="123456";
   static String sifre="1234";
   static double bakiye=50000;
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        /*

      ATM
     Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
      Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
       Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


     Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.
         Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        eger değilse menü ekraninageri donsun.
           Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
         */
        giris();
    }

  public static void giris() {
        /*
        Kullanicidan giriş için kart numarasi ve şifresini isteyin,
        eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
         */
        System.out.println("KART NUMARASINI GİRİNİZ");
        String kKartNo= scan.nextLine().replace(" ","");
        System.out.println("Şifrenizi giriniz");
        String kSifre=scan.next();

        if(kSifre.equals(sifre) && kKartNo.equals(kartNo)){
            menu();

        }else {
            System.out.println("KULLANICI ADI VEYA ŞİFRE YANLIŞ GİRİLDİ...");
            scan.nextLine(); // dummy ard arda scanner objesi kullnılığında alınan hatayı engellemek amaçlı kullanmak
            giris();

        }


    }

  public static void menu() {
        //  Menu listesinde Bakiye sorgula, para yatirma, para çekme,
        //  para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

        System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ : \n " +
                "1. BAKİYE SORGULAMA \n"+
                "2. PARA YATIRMA \n"+
                "3. PARA ÇEKME \n"+
                "4. PARA GÖNDERME \n" +
                "5. ŞİFRE DEĞŞTİRME \n"+
                "6. ÇIKIŞ \n"+
                "SEÇİNİZ:");
        int secim= scan.nextInt();
        switch (secim){
            case (1):{
                // bakiye sorgulama
                bakiyeSorgula();
            }
            case (2):
                // PARA YATIRMA
                System.out.println("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ");
                double miktar=scan.nextDouble();
                paraYatirma(miktar);
            case (3):{
                // " PARA ÇEKME
                System.out.println("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ");
                double miktar1= scan.nextDouble();
                paraCekme(miktar1);
            }
            case (4):{
                // PARA GÖNDERME
                System.out.println("GÖNDERMEK İSTEDİĞİNİZ METHODU GİRİNİZ");
                double miktar1= scan.nextDouble();
                paraGönderme(miktar1);
            }
            case (5):{
                // ŞİFRE DEĞŞTİRME
                System.out.println("ŞİFRENİZİ DEĞİŞTİRİNİZ");

                yeniSifreolustur(sifre);

            }
            case (6):{
                // ÇIKIŞ;
                System.exit(0);
            }
        }




    }

   public static void yeniSifreolustur(String sifre) {
       String sifre1= scan.next().replaceAll(" ","");
       sifre=sifre1;
       menu();

    }

    public static void paraGönderme(double miktar1) {
        bakiye-=miktar1;
        bakiyeSorgula();

    }

  public static void paraCekme(double miktar1) {
        bakiye-=miktar1;
        bakiyeSorgula();
    }

    public static void paraYatirma(double miktar) {
        bakiye+=miktar;
        bakiyeSorgula();
    }

   public static void bakiyeSorgula() {
        System.out.println("BAKİYENİZ : "+ bakiye);
        menu();
    }
}
