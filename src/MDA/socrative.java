package MDA;

public class socrative {

    public static void main(String[] args) {
       String str1="Ebru";
       String str2= new String("Ebru");

        System.out.println(str1.equals(str2)); // true  burda değerin aynı olup olmadığına baktı
        System.out.println(str1==(str2)); // false  burda objelerin eşitliğine baktı

        String s="";
        s+=2;
        s+='c';
        s="false";

        System.out.println(s=="2cfalse");
        System.out.println(s.equals("2cfalse"));






    }
    }

