class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class ServerChain {
    static Node findMiddleServer(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}