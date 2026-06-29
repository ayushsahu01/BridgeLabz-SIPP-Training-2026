import java.util.HashSet;

public class EventEntryVerification {

    static HashSet<String> participants = new HashSet<>();

    static void registerParticipant(String email) {
        if (participants.add(email))
            System.out.println(email + " registered successfully.");
        else
            System.out.println("Duplicate registration! " + email + " is already registered.");
    }

    static void displayParticipants() {
        System.out.println("\nRegistered Participants:");
        for (String email : participants) {
            System.out.println(email);
        }
        System.out.println("Total Eligible Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("ayush@gmail.com");
        registerParticipant("rohit@gmail.com");
        registerParticipant("ankit@gmail.com");
        registerParticipant("ayush@gmail.com"); 

        displayParticipants();
    }
}