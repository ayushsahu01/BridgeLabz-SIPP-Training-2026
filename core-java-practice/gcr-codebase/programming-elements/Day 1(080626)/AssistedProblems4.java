import java.util.*;
public class AssistedProblems4 {
    public static void main(String arhs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle:");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle with radius " + radius + " is: " + area);
        sc.close();
    }
}
