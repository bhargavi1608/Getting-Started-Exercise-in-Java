
import java.util.Scanner;

public class MeanOfArray {
    public static double func(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        double previousMean = func(arr,n-1);
        double sum = previousMean*(n-1)+arr[n-1];
        return  sum/n;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            double res=func(arr,n);
            System.out.println(res);
}
    }
  
    
}
