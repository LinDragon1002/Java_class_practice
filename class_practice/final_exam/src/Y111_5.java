import java.util.Scanner;
// 找最大數
// 假設使用者輸入兩行數字，第一行是要判斷幾個數字，第二行是所有要判斷的數字， 請輸出當中最大的數字

public class Y111_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i=0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println(data[n - 1]);
    }
}
