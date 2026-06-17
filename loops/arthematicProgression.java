// Display this AP 2,5,8,11...upto 'n' terms
//formula - a till n term = a+(n-1)d => 3n-1

import java.util.Scanner;

class arthematicProgression{
    public static void main(String[] args) {
        System.out.println("Enter the number till which you wana print");
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i =2; i<=3*n-1 ; i+=3){
            System.err.println(i);
        }
    }
}
