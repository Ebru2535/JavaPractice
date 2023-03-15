package kendiörnekleriim;

import java.util.Scanner;

public class sesliHarffler {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        switch (harf){
            case 'A':
            case 'E':
            case 'O':
            case 'I':
            case 'İ':
            case 'U':
            case 'Ü':
                System.out.println("giirilen harf sesli harftir");
                break;
            default:

                System.out.println("girilen harf sessiz harftir");
        }
    }
}
