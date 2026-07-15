class PacketBuffer {
    private int[] data;
    private int front, count;

    PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    boolean enqueue(int packetId) {
        if (count == data.length)
            return false;
        data[(front + count) % data.length] = packetId;
        count++;
        return true;
    }

    int dequeue() {
        if (count == 0)
            throw new RuntimeException("Buffer empty");
        int val = data[front];
        front = (front + 1) % data.length;
        count--;
        return val;
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean isFull() {
        return count == data.length;
    }

    int size() {
        return count;
    }

    void display() {
        if (count == 0) {
            System.out.println("Buffer empty");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }
        System.out.println();
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        PacketBuffer buffer = new PacketBuffer(5);
        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);
        buffer.enqueue(104);
        buffer.enqueue(105);
        buffer.display();
        System.out.println("Processed: " + buffer.dequeue());
        System.out.println("Processed: " + buffer.dequeue());
        buffer.display();
        buffer.enqueue(106);
        buffer.enqueue(107);
        buffer.display();
        System.out.println("Buffer Full: " + buffer.isFull());
    }
}