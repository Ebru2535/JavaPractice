package week02;

import java.util.Scanner;

public class P04_IfStatments {
    public static void main(String[] args) {
             /*
          1 - Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
             Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
             *** String icin equals method'unusalı kullanin
                 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bugün günlerden hangi gün:");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Bugün Hafta sonu, iyi tatiller");
        }
        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarsamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Bugün Haftaiçi, kolay gelsin");
        }
        if (!(gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")
                || gun.equals("cumartesi") || gun.equals("pazar"))) {
            System.out.println("Yanlış bir giriş yaptınız! ");
        }

    }

}
