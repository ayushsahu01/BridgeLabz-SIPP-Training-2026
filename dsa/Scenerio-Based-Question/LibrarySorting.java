import java.util.Random;

public class LibrarySorting {

    // ---------------- Merge Sort ----------------
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // ---------------- Quick Sort ----------------
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ---------------- Counting Sort ----------------
    static void countingSort(int[] arr) {
        int max = 20;
        int[] count = new int[max + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;

        for (int i = 1; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    static int[] generateRandomArray(int size, int maxValue) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(maxValue) + 1;

        return arr;
    }

    static int[] copyArray(int[] arr) {
        return arr.clone();
    }

    public static void main(String[] args) {

        int[] sizes = {100, 1000, 10000};

        for (int size : sizes) {

            System.out.println("\nInput Size = " + size);

            int[] original = generateRandomArray(size, 2025);

            int[] mergeArray = copyArray(original);
            int[] quickArray = copyArray(original);

            int[] countArray = generateRandomArray(size, 20);

            long start = System.nanoTime();
            mergeSort(mergeArray, 0, mergeArray.length - 1);
            long end = System.nanoTime();

            System.out.println("Merge Sort Time : " + (end - start) + " ns");

            start = System.nanoTime();
            quickSort(quickArray, 0, quickArray.length - 1);
            end = System.nanoTime();

            System.out.println("Quick Sort Time : " + (end - start) + " ns");

            start = System.nanoTime();
            countingSort(countArray);
            end = System.nanoTime();

            System.out.println("Counting Sort Time : " + (end - start) + " ns");
        }
    }
}