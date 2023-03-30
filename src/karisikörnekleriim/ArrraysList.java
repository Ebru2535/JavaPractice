package karisikörnekleriim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrraysList {
    public static void main(String[] args) {
        List<String> isimListesi= new ArrayList<>(Arrays.asList("ayse","fatma", "eda"));
        System.out.println(istenmeyeniSil(isimListesi,"t"));
    }

public static List<String> istenmeyeniSil(List<String> isimListesi,String harf) {
    List<String>yeniListe=new ArrayList<>();
    for (String each:isimListesi) {
        if (!each.contains(harf)){
            yeniListe.add(each);
        }
    }
    return yeniListe;
    }
}
