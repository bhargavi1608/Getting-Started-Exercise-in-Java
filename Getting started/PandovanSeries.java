
import java.util.Scanner;

public class PandovanSeries {
    public static int pandovan(int n){
        if(n==0||n==1||n==2){
            return 1;

        }
        else{
            return pandovan(n-2)+pandovan(n-3);
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i=0;i<=n;i++){
                System.out.print(pandovan(i)+" ");
            }

        }
    }
}
