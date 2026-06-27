import java.util.Scanner;

class tillPositive{
    public static void main(String[] args) {
        System.out.println("Enter the number from which you wana print");
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i =n; i>0 ; i-=4){
            System.err.print(i+" ");
        }
    }
}