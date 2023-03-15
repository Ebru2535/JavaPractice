package week04;

public class P06_WhileLoop {
    public static void main(String[] args) {


    // While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin.
        int sayi= 10 ;
        String sayılar="";

        while (sayi<100){
            if(sayi%7==0){
                sayılar+=sayi+ " ,";
            }sayi++;
        }
        System.out.println(sayılar.substring(0,sayılar.length()-1)); // sondaki virgül silinsin diye substring kullandık

    }
}
