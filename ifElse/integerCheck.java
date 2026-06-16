import java.util.Scanner;
class integerCheck {
    public static void main(String[] args) {
        double realNumber ;
        System.out.println("enter real nnumber:");
        Scanner sc = new Scanner(System.in);
        realNumber= sc.nextDouble();
        int x = (int)realNumber; 
        if (realNumber-x>0){
            System.out.println("not integer");
        }
        else System.out.println("it is integer");
    }
}