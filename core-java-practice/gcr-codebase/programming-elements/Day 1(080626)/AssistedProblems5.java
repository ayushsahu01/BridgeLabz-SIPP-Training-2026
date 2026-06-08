import java.util.*;
public class AssistedProblems5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius:");
        double radius = sc.nextDouble();
        System.out.println("Enter the Height:");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the Cylinder with radius " + radius + " and height " + height + " is: " + volume);
        sc.close();
    }
}
