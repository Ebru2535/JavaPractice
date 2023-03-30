package Array;

public class Soru1 {
    public static void main(String[] args) {
    /*   Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        kullanildigini yazdiran bir method olusturun.*/

        int[] arr={3,2,5,6,3,5,1,6};

        TekrarEdenVarMi(arr,2);
    }

   public static void TekrarEdenVarMi(int []arr, int istenenEleman ) {

        int sayac=0;

       for (int i = 0; i < arr.length; i++) {
               if(arr[i]==istenenEleman) {
                   sayac++;
             }

       }
       System.out.println(istenenEleman+ " " + sayac + " kez yazılmıştır ");
       }}


