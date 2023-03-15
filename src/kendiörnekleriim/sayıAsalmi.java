package kendiörnekleriim;

public class sayıAsalmi {
    public static void main(String[] args) {
        int sayi=7;
        int sonuc=sayi%2;
        System.out.println(sonuc); // 0
         boolean asal= true;
         if(sayi<1)      {System.out.println("gecersiz sayı  girdiniz");}
         if(sayi==0)    {System.out.println("asal sayı değidlir");}

        for (int i = 2; i < sayi; i++) {
            if(sayi==0){
                asal=false;
            }

        }
        if(asal){
            System.out.println("sayı asaldır");
        }else {
            System.out.println("sayı asal değildir");
        }
    }
}
