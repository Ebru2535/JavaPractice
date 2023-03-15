package week03;

import java.util.Scanner;

public class P09_forLoop {
    public static void main(String[] args) {

/*
Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */
        Scanner scanner= new Scanner(System.in);
        System.out.println("bir başlangıç değeeri girin:");
        int baslangicDegeri= scanner.nextInt();

        System.out.println("bitiş değeri girin:");
        int bitisDegeri= scanner.nextInt();

        int toplam=0;
        if(bitisDegeri<baslangicDegeri){
            System.out.println("== başalngıç değeri bitiş değerinden küçük olmalıdır");
        }else {
            for (int i = baslangicDegeri; i <=bitisDegeri; i++) {
                toplam+=i;
            }
        }
        System.out.println(" girilen sayılar değerler arasındakı sayılar toplamı : "+toplam);
    }
}
