import java.util.Scanner;
// 快樂數
// 快樂數（happy number）有以下的特性：在給定的進位制下，該數字所有數位(digits)的平方和，得到的新數再次求所有數位的平方和，如此重複進行，最終結果必為1。
// ex: 28 → 2²+8²=68 → 6²+8²=100 → 1²+0²+0²=1
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
