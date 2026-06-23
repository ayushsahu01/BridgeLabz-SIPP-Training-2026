public class Main {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("SB101", "Ayush", 50000, 5);

        CurrentAccount current =
                new CurrentAccount("CA201", "Rahul", 40000, 2);

        // Savings Account
        savings.deposit(5000);
        savings.withdraw(3000);

        System.out.println("\n===== Savings Account =====");
        savings.displayAccountDetails();
        System.out.println("Interest : ₹" + savings.calculateInterest());

        // Current Account
        current.deposit(10000);
        current.withdraw(5000);

        System.out.println("\n===== Current Account =====");
        current.displayAccountDetails();
        System.out.println("Interest : ₹" + current.calculateInterest());
    }
}