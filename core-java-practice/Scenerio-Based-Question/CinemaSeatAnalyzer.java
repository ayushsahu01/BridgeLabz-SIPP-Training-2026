import java.util.*;
public class CinemaSeatAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println("Enter seat status (0 = Empty, 1 = Booked):");
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        int booked = 0, available = 0;

        int maxLength = 0;
        int startPos = -1, endPos = -1;

        int currentStart = -1;
        int currentLength = 0;

        for (int i = 0; i < n; i++) {

            if (seats[i] == 1) {
                booked++;
            } else {
                available++;
            }

            if (seats[i] == 0) {
                if (currentLength == 0) {
                    currentStart = i;
                }
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startPos = currentStart;
                    endPos = i;
                }
            } else {
                currentLength = 0;
            }
        }

        System.out.println("\nTotal Booked Seats: " + booked);
        System.out.println("Total Available Seats: " + available);

        System.out.println("\nLongest Continuous Available Block:");
        System.out.println("Starting Position: " + (startPos + 1));
        System.out.println("Ending Position: " + (endPos + 1));
        System.out.println("Block Size: " + maxLength);

        if (maxLength >= 5) {
            System.out.println("\nSuggestion: Yes, a group of 5 people can sit together.");
        } else {
            System.out.println("\nSuggestion: No, a group of 5 people cannot sit together.");
        }

        sc.close();
    }
}