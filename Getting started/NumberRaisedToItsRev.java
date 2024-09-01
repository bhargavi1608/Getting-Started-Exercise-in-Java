
import java.util.Scanner;

public class NumberRaisedToItsRev {
    public static long func(int original, int reverse){
        long a=1;
        long x=1000000000+7;
        for(int i=1; i<=reverse;i++){
            a*=original;
            a%=x;
        }
        return a;
    }
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int original = sc.nextInt();
        int reverse = sc.nextInt();
        System.out.println(func(original, reverse));

       }
    }
    
}
