package week01;

import java.util.Scanner;

public class C01_kemd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfn bir kelime giriniz");
        String kelime= scanner.nextLine();
         savasıTersCevir(kelime);
    }
    public static void savasıTersCevir(String  kelime) {

       String toplam="";
        for (int i = kelime.length()-1; i >=0 ; i--) {
            toplam+=kelime.charAt(i);


        }
        System.out.println("girilen kelimenin tersi :"+toplam);
    }
}
