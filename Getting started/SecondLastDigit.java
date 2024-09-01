
import java.util.Scanner;

public class SecondLastDigit { 
    public static  int secondlastdigit(int n){
        int l = Math.abs(n%100);
        return l/10;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println(secondlastdigit(n));
        }
    }

}
