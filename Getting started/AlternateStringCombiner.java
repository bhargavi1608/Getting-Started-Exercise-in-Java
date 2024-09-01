
import java.util.Scanner;

public class AlternateStringCombiner {
    public static  void alternatestring(String a, String b){
        StringBuilder result = new StringBuilder();
        int lena=a.length();
        int lenb=b.length();
        int minlen=Math.min(lena,lenb);//to determine the length for the alternating part.
        for(int i=0;i<minlen;i++){
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
       if(lena>lenb){
        result.append(a.substring(minlen));// append remaining characters if one string is longer.
       }
       else if(lenb>lena){
         result.append(b.substring(minlen));
       }
       System.out.println(result.toString());//Used result.toString() to convert the StringBuilder to a String before printing.
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        String a = sc.next();
        String b = sc.next();
       
        alternatestring(a, b);
    }
}
}
