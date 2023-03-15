package prative;

public class örnek2 {
    public static void main(String[] args) {
        int arr[][] = { {1,2,3}, {4}, {5, 6}};
        for(int[] w : arr){

            System.out.print(w.length + " ");

        }
        System.out.println(arr.length);
    }
}
