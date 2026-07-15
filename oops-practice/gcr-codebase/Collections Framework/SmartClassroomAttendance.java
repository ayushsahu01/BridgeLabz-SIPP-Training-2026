import java.util.*;

public class SmartClassroomAttendance {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println(student + " is already marked present in " + subject);
        }
    }

    static void displayAttendance() {

        System.out.println("\nAttendance Report:");

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println("\nSubject: " + subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students Present: " + students.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Ayush");
        markAttendance("Java", "Rohit");
        markAttendance("Python", "Ankit");
        markAttendance("Python", "Ayush");
        markAttendance("Java", "Ayush");

        displayAttendance();
    }
}