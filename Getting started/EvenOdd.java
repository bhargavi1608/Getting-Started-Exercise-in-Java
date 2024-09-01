
import java.util.Scanner;


public class EvenOdd{
    public static int check(int n, int numbers[],String type){
      int count=0;
        for(int i=0;i<n;i++){
           if(type.equals("odd")){
                if(numbers[i]%2!=0){
                    count++;
                }
           
           }
           else if(type.equals("even")){
                if(numbers[i]%2==0){
                   count++;
                }
           }
            
        }
        return count;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers ");
        int [] numbers= new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();

        }
        System.out.println("Enter the odd or even");
        String type= sc.next();
        
        System.out.println(check(n, numbers, type));
        }
    }
}