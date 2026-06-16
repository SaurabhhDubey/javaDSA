
import java.util.Scanner;

class rectangle {
public static void main(String[] args) {
    System.err.println("enter length of rectangle:");
    int length , breadth;
    Scanner sc = new Scanner(System.in);
    length = sc.nextInt();
    System.err.println("enter breadth of rectangle:");
    breadth=sc.nextInt();
    int area =length*breadth;
    int perimeter = 2*(length+breadth);
    if(area>perimeter)
    {
        System.err.println("area is greater than perimeter");
    }
    else{
        System.err.println("perimeter is greater");
    }
}
}