import java.util.Scanner;

/**
 * 讓使用者輸入資料然後輸出
6
A 90 62
B 40 30
C 60 55
D 80 75
E 83 88
F 50 90
 */
public class App03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] names = new String[n];
        int[] scores_1 = new int[n];
        int[] scores_2 = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
            scores_1[i] = scanner.nextInt();
            scores_2[i] = scanner.nextInt();
        }
        System.out.println("======================");
        //輸出看看
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " " + scores_1[i] + " " + scores_2[i]);
        }
    }
}
