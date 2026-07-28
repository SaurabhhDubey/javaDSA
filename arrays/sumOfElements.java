
import java.util.Scanner;

public class sumOfElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       int sum=0;
    int[]arr = new int[6];
    for (int i =0 ;i< arr.length ; i++){
        arr[i]= sc.nextInt();

    }
    for(int i =0 ; i<arr.length ;i++){
        sum+=arr[i] ;
    }
    System.err.println(sum);


    }
}