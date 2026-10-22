package Recursion.Basics;
import java.util.*;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int x = sc.nextInt();
        System.out.println("Enter no.");
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
    }
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        int ans = gcd(y, x%y);
        return ans;
    }
}
