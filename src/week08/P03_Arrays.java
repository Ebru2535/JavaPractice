package week08;

public class P03_Arrays {
    /*
         Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
         basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
     */
    public static void main(String[] args) {


    int[] arr={3,4,8,9,10};
  elemanlariSagaKaydir();
}

   public static int[] elemanlariSagaKaydir(int [] arr) {
        int [] yeniArr= new int[arr.length];
        yeniArr[0]=arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i+1]=arr[i];
        }arr=yeniArr;
       return yeniArr;
    }
    }
