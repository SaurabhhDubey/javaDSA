
import java.util.Scanner;

public class outputInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       // int[] arr = {23,4,4,32,443,4};
       // System.err.println(arr[4]);
       //arr[3]=89;
       //System.err.println(arr[3]);
    int[]arr = new int[6];
    for (int i =0 ;i< arr.length ; i++){
        arr[i]= sc.nextInt();

    }
    for(int i =0 ; i<arr.length ;i++){
        System.err.print(arr[i]+ " ");
    }


    }
}