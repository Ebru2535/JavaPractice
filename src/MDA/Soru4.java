package MDA;

import java.util.Arrays;

public class Soru4 {
    public static void main(String[] args) {
        // Soru 3- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun ve tek katlı array döndür

        int[][] arr = {{3,1,2,4},{1,2}};
        System.out.println(Arrays.toString(sayılarınCarpımı(arr)));
    }

    public static int[] sayılarınCarpımı(int[][] arr) {
        int [] yeniarray = new int[1];
        int carpım1=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpım1*=arr[i][j];
            }


        } yeniarray[0]=carpım1;
        return yeniarray;


    }}


