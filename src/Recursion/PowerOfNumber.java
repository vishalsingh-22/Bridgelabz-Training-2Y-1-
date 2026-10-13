package Recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(pow(5,4));

    }
    public static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        int small = pow(p,q-1);
        return p * small;

    }
}
