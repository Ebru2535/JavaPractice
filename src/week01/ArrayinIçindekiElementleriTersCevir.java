package week01;

import java.util.Arrays;

public class ArrayinIçindekiElementleriTersCevir {
    public static void main(String[] args) {


        String[] arr = {"ebru", "ahmetEren", "savas"};

        String[] sonuç=new String[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr[i].length()-1; j >=0 ; j--) {

                sonuç[i]=""+arr[i].charAt(j);
            }
        }
        System.out.println(Arrays.toString(sonuç));

    }

}
