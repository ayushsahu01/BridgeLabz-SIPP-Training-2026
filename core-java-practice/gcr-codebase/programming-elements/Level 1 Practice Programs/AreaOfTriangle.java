import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("The area of triangle is " + area);
        input.close();
    }
}