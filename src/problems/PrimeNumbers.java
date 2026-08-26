package problems;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 88;
        System.out.println(isPrime(n));
    }
}