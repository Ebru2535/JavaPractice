package week08;

import java.util.Arrays;

public class P02_Arrays {
    //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
    //    method yaziniz.
    public static void main(String[] args) {
        int[] arr={2,-10,3,-5,20,6,9,-35};

        System.out.println((arraydekiPozitifSayilariTopla(arr)));
        // sonunc arra  olrak dönüorsa Arrays.toString ile yazdırırız
        // sonunc int döndğü için direk yazdırcam
    }


   public static int arraydekiPozitifSayilariTopla(int[] arr) {
        int toplam=0;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]>0){
               toplam+=arr[i];
           }

       } return toplam;

    }

}
