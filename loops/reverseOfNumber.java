import java.util.Scanner;

class rverseOfNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number for sum of its digits");
        int number = sc.nextInt();
        int reverse=0;
        while(number!=0){
            int temp = number%10;
            reverse = temp*10+temp;
            
        }
    }
}