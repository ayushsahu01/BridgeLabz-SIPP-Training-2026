import java.util.*;
public class NumberNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNtoOne(n);
        sc.close();
    }
    public static void printNtoOne(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNtoOne(n-1);
    }
}
