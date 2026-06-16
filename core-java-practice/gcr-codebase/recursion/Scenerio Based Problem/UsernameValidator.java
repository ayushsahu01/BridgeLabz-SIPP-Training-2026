public class UsernameValidator {
    public static void main(String[] args) {
        String username1 = "abcdxyz";
        String username2 = "abcD123";

        System.out.println(isValidUsername(username1, 0)); 
        System.out.println(isValidUsername(username2, 0)); 
    }
    public static boolean isValidUsername(String username, int index) {
        if (index == username.length()) {
            return true;
        }

        char ch = username.charAt(index);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValidUsername(username, index + 1);
    }
}