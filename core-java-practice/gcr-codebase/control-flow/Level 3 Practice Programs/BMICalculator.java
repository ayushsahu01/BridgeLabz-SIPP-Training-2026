import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble(); // in kg
        double heightCm = sc.nextDouble(); // in cm

        double heightMeter = heightCm / 100;

        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);

        if (bmi <= 18.4) {

            System.out.println("Status: Underweight");

        } else if (bmi <= 24.9) {

            System.out.println("Status: Normal");

        } else if (bmi <= 39.9) {

            System.out.println("Status: Overweight");

        } else {

            System.out.println("Status: Obese");
        }
        sc.close();
    }
}