import java.util.Scanner;

public class FindPeakElementSearch {

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftGreater = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightGreater = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            if (leftGreater && rightGreater) {
                return mid;
            }

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeakElement(arr);

        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element: " + arr[peakIndex]);

        sc.close();
    }
}
