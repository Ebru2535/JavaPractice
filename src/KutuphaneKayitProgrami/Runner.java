package KutuphaneKayitProgrami;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    // kitap sınıfı
    static class Kitap{

        String ad;
        String yazaradi;
        String yayinevi;
        int yayinyili;

        // Kitap nesnesi methodu
        public Kitap(String ad,String yayinevi,String yazaradi,int yayinyili){
            this.ad=ad;


            this.yayinevi=yayinevi;
        }

        //kitap özelliklerini yazdıran method
        public void kitapYazdir(){
            System.out.println("Kitap adı :" +ad);
            System.out.println("Yazar adı: "+yazaradi);
            System.out.println("Yayınevi: "+yayinevi);
            System.out.println("Yayın yılı:" +yayinyili);
        }

        public static void main(String[] args) {
            ArrayList<Kitap> kutuphane=new ArrayList<>();
            Scanner scanner= new Scanner(System.in);

            // kütüphane griş menusuu

            System.out.println("Kütüphane Kayıt Sistemi");
            System.out.println("------------------------");
            System.out.println("Yapamak istediğiniz işlemi seçiniz");
            System.out.println("1- Kitap Ekle");
            System.out.println("2- Kitapları Listele");
            System.out.println("3- Sistemden çık");

            int secim=0;
            while (secim!=0);
            System.out.println("Seçiminiz: ");
            secim=scanner.nextInt();


        }
    }
}
