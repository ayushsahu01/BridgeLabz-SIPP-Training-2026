import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rate:");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time:");
        double time = sc.nextDouble();
        System.out.println("Enter the Principal:");
        double principal = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
        sc.close();
    }
}
