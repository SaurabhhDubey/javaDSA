import java.util.Scanner;

class sumOfDigits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number for sum of its digits");
        int number = sc.nextInt();
        int sum=0;
        while(number!=0){
            sum += number%10;
            number/=10;
        }
        System.out.println( sum);
    }
}