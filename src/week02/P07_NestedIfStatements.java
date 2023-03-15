package week02;

import java.util.Scanner;

public class P07_NestedIfStatements {
    public static void main(String[] args) {
        /*
     1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
       Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
         KURALLAR
     :1999 yılı öncesi işe başlamıl olmak
     : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
     : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println(" işe başlama yılınız 1999,09 şeklinde giriniz");
        double giris= scan.nextDouble();
        if(giris>1999.09){
            System.out.println("Siz Eyt Kanun düzenlmesine Tabi değilsiniz");
        }else{
            System.out.println("lütfen cinsiyetinizi E ya da K olarak giriniz");
            char cinsiyet=scan.next().charAt(0);
            System.out.println("lütfen prim gün sayınızı giriniz");
            int primGün= scan.nextInt();
            System.out.println("lütfen hizmet sürenizi yıl olarak giriniz");
            int hizmetSüresi= scan.nextInt();

            if(cinsiyet=='e'|| cinsiyet=='E'){
                 if(primGün>=5500 && hizmetSüresi>=25){
                  System.out.println("tebrıkler emekli olabilirsiniz");
                   } else if (primGün<5500 && hizmetSüresi>=25) {
                     System.out.println("kanun yürülüğe girince" +(5500-primGün)+ "gün prim şartını tamamlamasınız gerekir");
                   } else if (primGün>=5500 && hizmetSüresi<25) {
                     System.out.println("kanun yürürlüğe girdiğinde " +(25-hizmetSüresi)+ "yıl daha çalışmalısınız");
                 }
            } else if (cinsiyet=='k'|| cinsiyet=='K') {
                if(primGün>=5000 && hizmetSüresi>=20){
                    System.out.println("emekli olabilirsin");
                   } else if (primGün<5000 && hizmetSüresi>=20) {
                    System.out.println("kanun yürülüğe girince" +(5000-primGün)+ "gün prim şartını tamamlamasınız gerekir");
                   } else if (primGün>=5000 && hizmetSüresi<20) {
                    System.out.println("kanun yürürlüğe girdiğinde " +(20-hizmetSüresi)+ "yıl daha çalışmalısınız");

                }else {
                    System.out.println("yanlıs bir değer ");
                }
            }

        }
    }
}
