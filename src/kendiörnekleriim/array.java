package kendiörnekleriim;

public class array {
    public static void main(String[] args) {


        int[] arr = new int[]{3, 5, 4, 8, 7};
        int aranacak = 10;
        boolean varMi = false;

        for (int sayi : arr) {
            if (sayi == aranacak) {
                varMi = true;
                break;

            }
        }
        if (varMi) {
            System.out.println("sayı mevcuttur");
        } else {
            System.out.println("sayı mevcut değil");
        }

    }}