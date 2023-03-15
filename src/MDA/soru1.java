package MDA;

import java.util.Arrays;

public class soru1 {
    public static void main(String[] args) {
      /* Soru 1- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        output: [5, 7, 11]

       */
        int[][] arr = {{3,4,5}, {2,3,6,7},{3,5,7,8}};

       int enkısaarrlenghti= arr[0].length;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length<enkısaarrlenghti){
                enkısaarrlenghti=arr[i].length;

            }

        }
        int[] toplamlarArray= new int[enkısaarrlenghti];

        for (int i = 0; i < toplamlarArray.length; i++) {
            for (int j = 0; j < arr.length; j++) {
              toplamlarArray[i]+=arr[j][i];
            }
        }
        System.out.println(Arrays.toString(toplamlarArray));

    }
}
