import java.util.Scanner;

class HappyNumber {
    int n;

    boolean check(int n) {
        while (true) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (Integer.toString(sum).length() == 1 || sum == n) {
                return sum == 1;
            }
            n = sum;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HappyNumber number = new HappyNumber();
        if (number.check(n)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
