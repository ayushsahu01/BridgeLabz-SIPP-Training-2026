import java.util.*;
public class SelfProblems2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length:");
        double length = sc.nextDouble();
        System.out.println("Enter the Width:");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
        sc.close();
    }
}
