import java.util.Scanner;
// 輸入一個以空格分隔的非常簡單的數字運算式
// 輸入 1 + 2，程式輸出 3
// 輸入 5 / 6，程式輸出 0.833 (小數點後取三位)

public class Y113_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strs = input.split(" ");

        int num1 = Integer.parseInt(strs[0]);
        String operator = strs[1];
        int num2 = Integer.parseInt(strs[2]);

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            double result = (double) num1 / num2;
            System.out.printf("%.3f%n", result);
        }

        sc.close();
    }
}
