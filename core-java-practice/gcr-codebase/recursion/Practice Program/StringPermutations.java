public class StringPermutations {
    public static void main(String[] args) {
        String input = "ABC";
        generatePermutations(input.toCharArray(), 0);
    }
    public static void generatePermutations(char[] str, int index) {
        if (index == str.length - 1) {
            System.out.println(new String(str));
            return;
        }

        for (int i = index; i < str.length; i++) {
            char temp = str[index];
            str[index] = str[i];
            str[i] = temp;

            generatePermutations(str, index + 1);
            temp = str[index];
            str[index] = str[i];
            str[i] = temp;
        }
    }
}