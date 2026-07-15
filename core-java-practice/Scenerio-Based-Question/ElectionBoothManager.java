import java.util.*;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Election Booth Manager!");

        String anotherVote = "yes";
        while (anotherVote.equals("yes")) {

            System.out.print("Enter Your Age: ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible to vote. Please proceed to the voting booth.");
            } else {
                System.out.println("You are not eligible to vote. Please come back when you are 18 years old.");
                break;
            }

            System.out.print(
                    "Enter the Number Corresponding to your vote: \n1: BJP \n2: Congress \n3: AAP \n4: BSP \n5: Nota\n");
            int vote = sc.nextInt();
            switch (vote) {
                case 1:
                    System.out.println("You have voted for BJP.");
                    break;
                case 2:
                    System.out.println("You have voted for Congress.");
                    break;
                case 3:
                    System.out.println("You have voted for AAP.");
                    break;
                case 4:
                    System.out.println("You have voted for BSP.");
                    break;
                case 5:
                    System.out.println("You have voted for Nota.");
                    break;
                default:
                    System.out.println("Invalid vote. Please try again.");
            }
            System.out.print("Do you want to cast another vote? (yes/no): ");
            anotherVote = sc.next();
            if (anotherVote.equals("no")) {
                break;
            }
        }
        sc.close();
    }
}
