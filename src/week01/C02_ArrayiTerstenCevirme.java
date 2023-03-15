package week01;

import java.util.Arrays;

public class C02_ArrayiTerstenCevirme {
    public static void main(String[] args) {

        String[] arr = {"ebru", "ahmetEren", "savas"};

        tersMetindöndür(arr);

    }

    public static void tersMetindöndür(String[] arr) {
        String[] kutu = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--, j++) {
            kutu[j] = arr[i];

        }
        System.out.println(Arrays.toString(kutu));


    }


}
