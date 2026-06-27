import java.util.Scanner;

class digitOfNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number to find its digit");
        int number = sc.nextInt();
        int count =0;
        if(number==0) number = 9;// to avoid 0 related problem
        while(number!=0){ // focus on this logic
        number /= 10;     // also this one
        count++;
        }
        System.out.println( "digit of number is - "+count);
    }
}