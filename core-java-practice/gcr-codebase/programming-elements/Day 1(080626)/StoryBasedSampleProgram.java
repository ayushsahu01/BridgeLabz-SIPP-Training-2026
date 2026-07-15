import java.util.*;
public class StoryBasedSampleProgram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hii Ravi, Please Share Your Details Below");
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Your Rank:");
        int rank = sc.nextInt();
        System.out.print("Enter your Salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter Your Fees: ");
        float fees = sc.nextFloat();
        float bonus = ((12f/100)*salary);
        int bonus1 = (int)(bonus+salary);
        System.out.println("Your Bonus is: "+ bonus1);
        sc.close();
    }
}