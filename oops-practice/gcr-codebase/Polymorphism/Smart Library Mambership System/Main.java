public class Main {

    static void displayMembers(LibraryMember[] members, int overdueDays) {

        System.out.println("===== Library Members =====");

        for (LibraryMember member : members) {
            member.printDetails();

            System.out.println("Fine for " + overdueDays +
                    " overdue days: ₹" + member.calculateFine(overdueDays));

            System.out.println("---------------------------");
        }
    }

    static void searchMember(LibraryMember[] members, String id) {

        boolean found = false;

        for (LibraryMember member : members) {
            if (member.memberId.equals(id)) {
                System.out.println("\nMember Found:");
                member.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nMember with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Ayush", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rahul", "G301"),
                new StudentMember("Priya", "S102")
        };

        displayMembers(members, 5);

        searchMember(members, "F201");
    }
}