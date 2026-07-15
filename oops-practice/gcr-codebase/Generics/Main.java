import java.util.*;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("Pair: " + first + ", " + second);
    }
}

class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public void display() {
        System.out.println(list);
    }
}

class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        System.out.println(data);
    }
}

public class Main {

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Ayush", 101);
        pair.display();

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());

        stack.display();

        Integer[] numbers = {12, 45, 67, 23, 89};
        System.out.println("Maximum = " + findMax(numbers));

        Repository<String> repo = new Repository<>();
        repo.add("Java");
        repo.add("Python");
        repo.add("C++");

        repo.display();

        List<String> names = Arrays.asList("Ayush", "Rahul", "Aman");
        printList(names);

        List<Integer> marks = Arrays.asList(80, 90, 95);
        printList(marks);
    }
}