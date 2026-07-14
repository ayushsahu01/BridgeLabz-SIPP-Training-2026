class CallStack {
    private static class Frame {
        String functionName;
        Frame next;

        Frame(String functionName, Frame next) {
            this.functionName = functionName;
            this.next = next;
        }
    }

    private Frame top = null;

    public void push(String functionName) {
        top = new Frame(functionName, top);
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("No active call to return from");
        }
        String name = top.functionName;
        top = top.next;
        return name;
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Call stack is empty");
        }
        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class LinkedListBasedStack {
    public static void main(String[] args) {
        CallStack cs = new CallStack();
        cs.push("main()");
        cs.push("login()");
        cs.push("validateUser()");
        System.out.println("Current Function: " + cs.peek());
        System.out.println("Returned From: " + cs.pop());
        System.out.println("Current Function: " + cs.peek());
    }
}