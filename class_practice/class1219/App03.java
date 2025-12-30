class PrimeChecker{

    boolean isPrime(int n){
        for (int i = 2; i < n; i++)
            if(n % i == 0) return false;
        return true;
    }
}
public class App03 {
    
    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        System.out.println("10->" + checker.isPrime(10));
        System.out.println("11->" + checker.isPrime(11));
    }
}
