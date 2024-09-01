
import java.util.Scanner;

public class MultipleChecker {
    public static int check(int num1,int num2){
        if(num1==0||num2==0){
            return 3;
        }
        if(num1%num2==0){
            return 2;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(check(num1, num2));
        }
    }
}
