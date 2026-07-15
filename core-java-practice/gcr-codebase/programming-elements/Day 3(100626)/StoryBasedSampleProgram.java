import java.util.*;

public class StoryBasedSampleProgram {

    public static void analyzeStock(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;

        for (int num : arr) {

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

            sum += num;

            if (set.contains(num)) {
                hasDuplicate = true;
            }

            set.add(num);
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + sum);
        System.out.println("Contains Duplicates: " + hasDuplicate);
    }

    public static void rotateArray(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Rotated Array:");

        for (int num : rotated) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void transposeMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed Matrix:");

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stock array: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        System.out.println("Enter stock quantities:");

        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        analyzeStock(stock);

        System.out.print("Enter k for rotation: ");
        int k = sc.nextInt();

        rotateArray(stock, k);

        System.out.print("Enter rows of shelf grid: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns of shelf grid: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter shelf grid values:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        transposeMatrix(matrix);
        sc.close();
    }
}