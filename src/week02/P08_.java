package week02;

import java.util.Scanner;

public class P08_ {
    public static void main(String[] args) {
       // Soru 4- Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde
        // hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("haftanın hangi günündeyiz....:");
        String gunAdi= scan.next().toLowerCase();

        if(gunAdi.equals("pazartesi")){
            System.out.println("şimdi çalışma zamanı tatile 5 gün var");
        } else if (gunAdi.equals("salı")) {
            System.out.println("şimdi çalışma zamanı tatilr 4 gün var");
        } else if (gunAdi.equals("çarşamba")) {
            System.out.println("şimdi çalışma zamanı tatilr 3 gün var");
        } else if (gunAdi.equals("perşembe")) {
            System.out.println("şimdi çalışma zamanı tatilr 2 gün var");
        } else if (gunAdi.equals("cuma")) {
            System.out.println("şimdi çalışma zamanı tatilr 1 gün var");
        }else{
            System.out.println("şimdi dinlenme zamanı");
        }
    }
}
