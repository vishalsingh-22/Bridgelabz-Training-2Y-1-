package Recursion;

public class PrintDeceresingNumber {
    public static void main(String[] args) {
        print(1);
    }
    public static  void print(int n){
        if (n==15){
            System.out.println(n);
            return;
        }
        print(n+1);
        System.out.println(n);
    }
}
