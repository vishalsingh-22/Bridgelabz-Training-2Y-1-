package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        print(10);
    }
    public static  void print(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return ;
        }
        //Recursive case
        print(n-1);
        System.out.println(n);
    }
}
