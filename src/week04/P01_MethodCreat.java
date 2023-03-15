package week04;

import java.util.Scanner;

public class P01_MethodCreat {
    static String output="";
    public static void main(String[] args) {


     /*
    Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
    baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
    bir method olusturun.
        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
            mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen string bir ifade giriniz");
        String input = scan.nextLine();
        stringdekiHarfleriYazdır(input,4,2);

    }

    public static void stringdekiHarfleriYazdır(String input, int baslangic, int bitis){

        if (baslangic > bitis) {
            System.err.println("HATA: Başlangıç değeri bitiş değerinen büyük olamaz");

        } else if (baslangic > input.length() - 1 || bitis > input.length() - 1) {
            System.err.println("HATA: Girilen değer stringin sınırları dışında bir değerdir.");

        }else {
            input = input.replace(" ", "");
            for (int i = baslangic; i < bitis; i++) {
                output += input.charAt(i) + ",";

            }
            System.out.println(output);

    }}
}

