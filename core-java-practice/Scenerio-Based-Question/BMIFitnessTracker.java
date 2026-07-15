import java.util.*;
public class BMIFitnessTracker {
    public static void main(String args[]){
        System.out.println("Welcome to the Maya's BMI Fitness Tracker!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Weight in Kilograms: ");
        float weight = sc.nextFloat();
        System.out.print("Enter your Height in Meters: ");
        float height = sc.nextFloat();
        float bmi = weight / (height * height);
        if(bmi < 20){
            System.out.println("Your BMI is: " + bmi + " - You are Underweight.");
        }
        else if(bmi >= 20 && bmi < 25){
            System.out.println("Your BMI is: " + bmi + " - You are Normal weight.");
        }
        else{
            System.out.println("Your BMI is: " + bmi + " - You are Overweight.");
        }
        sc.close();
    }
}
