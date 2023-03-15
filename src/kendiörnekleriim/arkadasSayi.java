package kendiörnekleriim;

public class arkadasSayi {
    public static void main(String[] args) {
        int sayi= 220;
        int sayi1= 280 ;
        int toplam=0;
        int toplam1=0;

        for (int i = 1; i <sayi ; i++) {
            if(sayi%i==0){
                toplam+=i;
            }

        }
        for (int i = 1; i <sayi1 ; i++) {
            if (sayi1%i==0){
                toplam1+=i;
            }
        }
        if(sayi1==toplam1 && sayi==toplam ){
            System.out.println(" arakadaş sayı");
        }else {
            System.out.println("arkadaş sayı değildir");
        }
    }
}
