package Array;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {


     /*  Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]*/

        int[] arr = {3, 5, 6, 4};
        SagaKaydir(arr);
    }


        public static void SagaKaydir(int[] arr) {
            int sonElement= arr[arr.length-1];
            for (int i = arr.length-1; i >0 ; i--) {
                arr[i]=arr[i-1];
            }
            arr[0]=sonElement;
            System.out.println(Arrays.toString(arr));
        }
    }


