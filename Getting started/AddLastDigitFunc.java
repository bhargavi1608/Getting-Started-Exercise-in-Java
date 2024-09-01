import java.util.Scanner;
class AddLastDigitFunc{
       public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String input = sc.nextLine();
            String [] tokens = input.split(" ");
            int num1 =Integer.parseInt(tokens[0]);
            int num2 =Integer.parseInt(tokens[1]);
            System.out.println(addlastdigit(num1,num2));

            

        }
    }
    public static int addlastdigit(int num1,int num2){
        int first=Math.abs(num1%10);
        int second = Math.abs(num2%10);
        int result = first+second;
        return result;

    }


}