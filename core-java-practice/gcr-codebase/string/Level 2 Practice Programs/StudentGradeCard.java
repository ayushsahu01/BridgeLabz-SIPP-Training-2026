import java.util.*;
public class StudentGradeCard {
    // Generate random PCM marks
    public static int[][] generateMarks(int students) {
        Random random = new Random();
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = random.nextInt(90) + 10; // 10 to 99
            }
        }
        return marks;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {
        int students = marks.length;
        double[][] results = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Calculate grades
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else if (percentage >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        return grades;
    }

    // Display scorecard
    public static void displayScoreCard(int[][] marks, double[][] results, String[] grades) {

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-12s %-10s\n",
                "Student", "Physics", "Chem", "Maths", "Total", "Average", "Percent", "Grade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-12.2f %-10s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i]);
        }

        System.out.println("--------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);
        double[][] results = calculateResults(marks);
        String[] grades = calculateGrades(results);

        displayScoreCard(marks, results, grades);
        sc.close();
    }
}