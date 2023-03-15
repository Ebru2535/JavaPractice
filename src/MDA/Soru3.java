package MDA;

public class Soru3 {
    public static void main(String[] args) {
        // Soru 3- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun
        int[][] arr = {{3,1,2,4},{1,2}};
        System.out.println(sayılarınCarpımı(arr));
    }

   public static int sayılarınCarpımı(int[][] arr) {
       int carpım = 1;
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               carpım *= arr[i][j];

           }


       } return carpım;


   }}