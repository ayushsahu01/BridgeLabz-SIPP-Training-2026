class UndoBuffer {
    private String[] data;
    private int top;

    UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    public boolean push(String edit) {
        if (top == data.length - 1) {
            System.out.println("Undo buffer is full");
            return false;
        }
        data[++top] = edit;
        return true;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing to undo");
        }
        return data[top--];
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing to peek");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class ArrayBasedStack {
    public static void main(String[] args) {
        UndoBuffer ub = new UndoBuffer(5);
        ub.push("Type A");
        ub.push("Type B");
        ub.push("Delete B");
        System.out.println("Top Edit: " + ub.peek());
        System.out.println("Undo: " + ub.pop());
        System.out.println("Undo: " + ub.pop());
        System.out.println("Top Edit: " + ub.peek());
    }
}