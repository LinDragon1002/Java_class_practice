import java.util.Scanner;

public class Y113_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        int fib1 = 1;
        int fib2 = 1;
        String ans = "";

        if (fib1 >= a && fib1 <= b) {
            ans += fib1;
        }
        if (fib2 >= a && fib2 <= b) {
            if (!ans.isEmpty()) {
                ans += " ";
            }
            ans += fib2;
        }

        while (true) {
            int next = fib1 + fib2;
            if (next > b) {
                break;
            }
            if (next >= a) {
                if (!ans.isEmpty()) {
                    ans += " ";
                }
                ans += next;
            }
            fib1 = fib2;
            fib2 = next;
        }

        System.out.println(ans);
    }
}
