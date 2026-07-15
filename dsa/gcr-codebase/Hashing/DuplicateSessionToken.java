import java.util.*;

public class DuplicateSessionToken {

    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();

        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] tokens1 = {"A12", "B34", "C56", "D78"};
        String[] tokens2 = {"A12", "B34", "C56", "B34"};

        System.out.println(hasDuplicateToken(tokens1)); // false
        System.out.println(hasDuplicateToken(tokens2)); // true
    }
}