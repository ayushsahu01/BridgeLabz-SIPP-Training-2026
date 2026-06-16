public class StoryBasedSampleProgram {

    public static void main(String[] args) {

        System.out.println("=== Tower of Hanoi ===");
        int moves = towerOfHanoi(3, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moves);

        System.out.println("\n=== Binary Search ===");
        int[] prices = {100, 200, 300, 400, 500};
        int index = binarySearch(prices, 0, prices.length - 1, 400);
        System.out.println("Element found at index: " + index);

        System.out.println("\n=== Sum of Digits ===");
        System.out.println("Sum = " + sumOfDigits(1234));

        System.out.println("\n=== Reverse String ===");
        System.out.println(reverseString("HELLO"));

        System.out.println("\n=== Balanced Parentheses ===");
        System.out.println(isBalanced("((()))", 0, 0)); // true
        System.out.println(isBalanced("(()))", 0, 0));  // false
    }
    public static int towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return 1;
        }

        int count = 0;

        count += towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        count++;

        count += towerOfHanoi(n - 1, auxiliary, source, destination);

        return count;
    }

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, low, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, high, target);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static boolean isBalanced(String str, int index, int count) {

        if (count < 0) {
            return false;
        }

        if (index == str.length()) {
            return count == 0;
        }

        if (str.charAt(index) == '(') {
            return isBalanced(str, index + 1, count + 1);
        }

        if (str.charAt(index) == ')') {
            return isBalanced(str, index + 1, count - 1);
        }

        return isBalanced(str, index + 1, count);
    }
}