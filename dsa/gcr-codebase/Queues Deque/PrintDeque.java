import java.util.*;

class PrintQueue {
    private Deque<Integer> printQueue = new ArrayDeque<>();

    void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    int printNextJob() {
        if (printQueue.isEmpty())
            throw new RuntimeException("No jobs in queue");
        return printQueue.removeFirst();
    }

    void display() {
        if (printQueue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(printQueue);
    }
}

public class PrintDeque {
    public static void main(String[] args) {
        PrintQueue pq = new PrintQueue();

        pq.submitJob(101);
        pq.submitJob(102);
        pq.submitJob(103);

        pq.display();

        pq.submitUrgentJob(999);

        pq.display();

        System.out.println("Printing Job: " + pq.printNextJob());
        System.out.println("Printing Job: " + pq.printNextJob());

        pq.display();
    }
}