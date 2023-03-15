package week01;

public class P01_printFonksiyonu {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        System.out.println("\"Hello Word\"");

      /*
      \n  : bir alt satırdan yazmayı sağlar
      \t  : 1 tab boşluk bırakır
      \"  : " yazar
      \'  : ' yazar
       \\ : \ yazar
       \/  : / yazar

        */

        System.out.println("\"Hello\t\\\n'Word'\t\\/");

        // değer ata
        // ebru altun - öğretmen
        String isim=   "Ebru";
        String soyisim=  "Altun";
        String meslek= "ögretmen";
        System.out.println(isim+" "+soyisim+ " - "+meslek);


    }
}
