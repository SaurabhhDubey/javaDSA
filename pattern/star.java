import java.util.*;
class star{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int row  , column;
        row = sc.nextInt();
        column=sc.nextInt();

        for (int i=1; i<=row; i++){
            for(int j=1;j<=column;j++){
                System.out.print("* ");
            }
            System.err.println();
        }

    }
}