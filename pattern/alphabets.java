import java.util.*;
class alphabets{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.err.println();
        }

    }
}