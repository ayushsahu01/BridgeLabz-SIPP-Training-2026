import java.util.*;
public class CalculateAverageofThreeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number:");
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("Average of " + a + ", " + b + " and " + c + " is: " + avg);
        sc.close();
    }
}
