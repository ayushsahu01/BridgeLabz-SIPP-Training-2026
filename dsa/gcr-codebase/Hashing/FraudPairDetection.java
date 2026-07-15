import java.util.*;

public class FraudPairDetection {

    public static int[] findFraudPair(int[] amounts, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // amount -> index

        for (int i = 0; i < amounts.length; i++) {
            int complement = target - amounts[i];

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }

            seen.put(amounts[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] amounts = {30, 70, 20, 50, 80};
        int target = 100;

        int[] result = findFraudPair(amounts, target);

        if (result[0] != -1) {
            System.out.println("Fraud Pair Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No fraud pair found.");
        }
    }
}