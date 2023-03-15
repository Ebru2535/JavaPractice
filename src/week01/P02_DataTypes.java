package week01;

public class P02_DataTypes {
    public static void main(String[] args) {
        System.out.println("Merhaba Java");
        /*
        byte :  sadece tamsayı değeri alır  8 bit
        short : sadece tamsayı değeri alır  16 bit
        int   : sadece tamsayı değeri alır  32
        long  : sadece tamsayı değeri alır  64
        float : ondalıklı sayı / sonuna f koyulmalı
        double : ondalıklı
        boolean: false veya true
        char : tek tırnak tek karakter tırnak içinde olmadan sayıı ASCI
         */

        byte b1= Byte.MAX_VALUE;
        System.out.println("b1 :"+b1); //127L
        long a= Long.MIN_VALUE;
        System.out.println(a);   //-9223372036854775808
    }
}
