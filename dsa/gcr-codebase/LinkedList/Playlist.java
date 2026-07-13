class Node {
    int trackId;
    Node next;

    Node(int trackId) {
        this.trackId = trackId;
    }
}

class Playlist {
    static void insertAfter(Node current, int trackId) {
        if (current == null)
            return;
        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
    }
}