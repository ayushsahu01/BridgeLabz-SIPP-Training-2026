import java.util.*;

class Patient {
    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

class HospitalER {
    private PriorityQueue<Patient> triageQueue = new PriorityQueue<>((a, b) -> a.priority - b.priority);

    void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    Patient callNextPatient() {
        if (triageQueue.isEmpty())
            throw new RuntimeException("No patients waiting");
        return triageQueue.poll();
    }

    Patient peekNextPatient() {
        if (triageQueue.isEmpty())
            return null;
        return triageQueue.peek();
    }

    void displayNextPatient() {
        Patient p = peekNextPatient();
        if (p == null)
            System.out.println("No patients waiting");
        else
            System.out.println("Next Patient: " + p.name + " Priority: " + p.priority);
    }
}

public class PriorityQueues {
    public static void main(String[] args) {
        HospitalER er = new HospitalER();

        er.admitPatient(new Patient(3, "Rahul"));
        er.admitPatient(new Patient(1, "Aman"));
        er.admitPatient(new Patient(5, "Priya"));
        er.admitPatient(new Patient(2, "Neha"));

        er.displayNextPatient();

        while (true) {
            try {
                Patient p = er.callNextPatient();
                System.out.println("Treating: " + p.name + " Priority: " + p.priority);
            } catch (RuntimeException e) {
                break;
            }
        }

    }
}