package week03;

import java.util.Scanner;

public class P10_forLoop {
    public static void main(String[] args) {
        /*Kullanicidan 150'den küçük pozitif bir sayi alin, 1’den baslayarak tum
    tamsayilari yazdirin, sira
    - 3 ile bolunebilen bir sayiya gelirse, sayi yerine WISE
    - 5 ile bolunebilen bir sayiya gelirse sayi yerine QUARTER
    - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine WISE QUARTER
    yazdirin
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir poztif sayı giriniz");
        int girilenSayi= scan.nextInt();
        for (int i = 1; i <=girilenSayi ; i++) {
            if(i%3==0 && i%5==0){
                System.out.print("WİSE QARTER");
            } else if (i%5==0) {
                System.out.print("QARTER");
            } else if (i%3==0) {
                System.out.print("WİSE");
            }else {
                System.out.print(i+" ");
            }

        }
    }
}
