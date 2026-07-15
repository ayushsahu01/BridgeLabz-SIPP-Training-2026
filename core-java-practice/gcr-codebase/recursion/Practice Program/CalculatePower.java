import java.util.*;
public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findPower(x,n));
        sc.close();
    }
    public static int findPower(int x, int n){
        if(n==0){
            return 1;
        }
        return (x * findPower(x, n-1));
    }
}
