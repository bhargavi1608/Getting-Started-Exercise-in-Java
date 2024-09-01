
import java.util.Scanner;

public class CombineString {
    public static String combine(String a,String b){
        if(a.length()>b.length()){
            return b+a+b;
        }
        else{
            return a+b+a;
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String a = sc.next();
            String b = sc.next();
            System.out.println(combine(a, b));
        }

    }
}
