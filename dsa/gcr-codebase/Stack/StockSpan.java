import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StockSpan {

    public static int[] loadSpan(int[] load) {

        int n = load.length;
        int[] span = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && load[stack.peek()] <= load[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int[] load = {100, 80, 60, 70, 60, 75, 85};

        int[] result = loadSpan(load);

        System.out.println("Load Readings : " + Arrays.toString(load));
        System.out.println("Load Span     : " + Arrays.toString(result));
    }
}