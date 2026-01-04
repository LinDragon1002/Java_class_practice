import java.util.Scanner;
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
