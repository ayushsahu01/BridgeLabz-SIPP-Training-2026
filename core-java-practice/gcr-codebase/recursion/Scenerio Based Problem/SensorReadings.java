public class SensorReadings {
    public static void main(String[] args) {
        int[] readings1 = {12, 15, 18, 22, 30};
        int[] readings2 = {12, 15, 14, 22};

        System.out.println(isStrictlyIncreasing(readings1, 0)); 
        System.out.println(isStrictlyIncreasing(readings2, 0));
    }
    public static boolean isStrictlyIncreasing(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] >= arr[index + 1]) {
            return false;
        }

        return isStrictlyIncreasing(arr, index + 1);
    }
}