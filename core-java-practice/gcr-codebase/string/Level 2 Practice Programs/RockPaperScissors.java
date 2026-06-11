import java.util.*;
public class RockPaperScissors {
    public static String computerChoice() {

        int num = (int)(Math.random() * 3);

        if (num == 0) return "Rock";
        if (num == 1) return "Paper";

        return "Scissors";
    }

    public static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println("\nGame\tUser\tComputer\tWinner");

        for (int i = 1; i <= n; i++) {

            System.out.print("\nEnter choice (Rock/Paper/Scissors): ");
            String user = sc.next();

            String computer = computerChoice();

            String winner = findWinner(user, computer);

            if (winner.equals("User"))
                userWins++;

            if (winner.equals("Computer"))
                computerWins++;

            System.out.println(
                    i + "\t" +
                    user + "\t" +
                    computer + "\t\t" +
                    winner);
        }

        double userPercent =
                (userWins * 100.0) / n;

        double computerPercent =
                (computerWins * 100.0) / n;

        System.out.println("\n----- Statistics -----");
        System.out.println("User Wins = " + userWins);
        System.out.println("Computer Wins = " + computerWins);

        System.out.printf("User Win %% = %.2f\n",
                userPercent);

        System.out.printf("Computer Win %% = %.2f\n",
                computerPercent);
                sc.close();
    }
}