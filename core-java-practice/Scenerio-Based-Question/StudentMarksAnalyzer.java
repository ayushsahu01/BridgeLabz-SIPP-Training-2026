import java.util.*;
public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int countAbove75 = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] > 75) {
                countAbove75++;
            }

            sum += marks[i];
        }

        double average = (double) sum / n;

        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Students scoring above 75: " + countAbove75);
        System.out.println("Average Marks: " + average);

        System.out.println("\nMarks greater than average:");
        for (int i = 0; i < n; i++) {
            if (marks[i] > average) {
                System.out.print(marks[i] + " ");
            }
        }

        sc.close();
    }
}