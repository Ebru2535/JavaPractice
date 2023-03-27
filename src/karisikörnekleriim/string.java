package karisikörnekleriim;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
         :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
         yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String input = scan.nextLine();
        //int uzunluk=input.length();

        if ((input.length() / 2) % 2 == 0) {
            //int mid=uzunluk/2;
            input = input.substring(0, input.length() / 2) + ":)" + input.substring(input.length() / 2);
        } else {
            //int mid=uzunluk/2;
            input = input.substring(0, input.length() / 2) + ":(" + input.substring(input.length() / 2 + 1);
        }
        System.out.println("sonuç:" + input);

        // 2. yol

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String input1=scan.nextLine();
        int uzunluk=input1.length();

        if (uzunluk%2==0){
            int mid=uzunluk/2;
            input=input1.substring(0,mid)+":)"+input.substring(mid);
        }else {
            int mid=uzunluk/2;
            input1=input1.substring(0,mid)+":("+input1.substring(mid+1);
        }
        System.out.println("sonuç:"+ input1);



    }
}