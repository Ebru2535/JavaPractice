package karisikörnekleriim;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
     // Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        // sayisini bir list olarak donduren bir method olusturun
        // fibonaci  0 1 1 2 3 5 8 13 21
        System.out.println(fibonacciSayisiniListele(0));


    }
         public static List<Integer>  fibonacciSayisiniListele(int sayıadedi) {
            List<Integer> fibonacci= new ArrayList<>();

          /*  if(sayıadedi<=0){
                System.out.println("yanlış giriş");
            } else if (sayıadedi==1) {
                fibonacci.add(0);

            } else if (sayıadedi==2) {
                fibonacci.add(0);
                fibonacci.add(1);

            }else {
                int birinciElemen=0;
                fibonacci.add(birinciElemen);
                int ikinciEleman=1;
                fibonacci.add(ikinciEleman);
                int yeniElemansayısı= ikinciEleman+birinciElemen;
                fibonacci.add(yeniElemansayısı);

                while(fibonacci.size()<sayıadedi){
                birinciElemen=ikinciEleman;
                ikinciEleman=yeniElemansayısı;
                yeniElemansayısı= birinciElemen+ikinciEleman;
                fibonacci.add(yeniElemansayısı);

            }
        }
            return fibonacci;
 */
             fibonacci.add(0);
             fibonacci.add(1);
             fibonacci.add(1);
             for (int i = 2; i <sayıadedi ; i++) {
                 fibonacci.add(fibonacci.get(i-2)+ fibonacci.get(i-1));

             }
             return fibonacci;
}}
