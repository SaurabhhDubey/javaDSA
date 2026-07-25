import java.util.*;
class triangleStar{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int row  ;
        row = sc.nextInt();
        

        for (int i=1; i<=row; i++){  // for flipped triangle i=row and i>=1 , i--
            for(int j=1;j<=i ;j++){
                System.out.print("* ");
            }
            System.err.println();
        }

    }
}