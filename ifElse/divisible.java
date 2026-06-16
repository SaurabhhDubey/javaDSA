
import java.util.Scanner;

class divisible {
public static void main(String[] args) {
    System.err.println("Enter positive integer:");
    int positiveInt;
    Scanner sc = new Scanner(System.in);
    positiveInt = sc.nextInt();
    if(positiveInt%5==0){
        System.out.println("Divisible by 5");
    }
    else
    System.out.println("not divisible by 5 LOL");

}
}