package kendiörnekleriim;

public class mükemmelSayi {
    public static void main(String[] args) {
        // 6:3+2+1

        int sayi=28;
        int toplam=0;

        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                toplam+=i;   // toplam= toplam+i
            }


        }if(toplam== sayi){
            System.out.println("sayı mükemmel sayıdır");
        }else {
            System.out.println("sayı mükemmel sayı değilir");
        }
    }
}
