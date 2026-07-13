class Coach {
    int id;
    Coach next;

    Coach(int id) {
        this.id = id;
    }
}

class Train {
    Coach head;

    public void addCoach(int id) {
        Coach n = new Coach(id);
        if (head == null) {
            head = n;
            return;
        }
        Coach t = head;
        while (t.next != null)
            t = t.next;
        t.next = n;
    }

    public void removeCoach(int id) {
        if (head == null)
            return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Coach t = head;
        while (t.next != null && t.next.id != id)
            t = t.next;
        if (t.next != null)
            t.next = t.next.next;
    }

    public void reverse() {
        Coach prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public boolean hasCycle() {
        Coach slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public Coach middleCoach() {
        Coach slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Coach mergeSorted(Coach a, Coach b) {
        Coach dummy = new Coach(0);
        Coach t = dummy;
        while (a != null && b != null) {
            if (a.id <= b.id) {
                t.next = a;
                a = a.next;
            } else {
                t.next = b;
                b = b.next;
            }
            t = t.next;
        }
        if (a != null)
            t.next = a;
        else
            t.next = b;
        return dummy.next;
    }

    public void display() {
        Coach t = head;
        while (t != null) {
            System.out.print(t.id + " ");
            t = t.next;
        }
        System.out.println();
    }
}

public class TrainManagement {
    public static void main(String[] args) {
        Train train = new Train();
        train.addCoach(10);
        train.addCoach(20);
        train.addCoach(30);
        train.addCoach(40);
        train.display();
        train.removeCoach(20);
        train.display();
        train.reverse();
        train.display();
        System.out.println(train.hasCycle());
        Coach mid = train.middleCoach();
        System.out.println(mid.id);
        Train t1 = new Train();
        t1.addCoach(1);
        t1.addCoach(3);
        t1.addCoach(5);
        Train t2 = new Train();
        t2.addCoach(2);
        t2.addCoach(4);
        t2.addCoach(6);
        Coach merged = Train.mergeSorted(t1.head, t2.head);
        while (merged != null) {
            System.out.print(merged.id + " ");
            merged = merged.next;
        }
    }
}