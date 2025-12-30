import java.util.Scanner;

public class App05_fib {
    /*
    * 使用陣列來解費式數列問題
    * 假設使用者輸入 n ，程式輸出第 n 個費式數列的值
    * 位置從 1 開始算
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fibs = new int[n];
        fibs[0] = fibs[1] = 1;
        for(int i=2; i<n ;i++){
            fibs[i] = fibs[i-1] + fibs[i-2];
        }
        System.out.println(fibs[n-1]);

        System.out.print(fibs[0]);
        for (int i = 1; i < fibs.length; i++) {
            System.out.print("," + fibs[i]);
        }
    }
}
