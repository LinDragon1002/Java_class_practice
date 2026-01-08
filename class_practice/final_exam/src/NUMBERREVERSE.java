import java.util.Scanner;

public class NUMBERREVERSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sts = sc.nextInt();
            if (sts == -1) {
                break;
            }
            String ans = "";
            int len = Integer.toString(sts).length();
            for(int i=0; i < len; i++) {
                int temp = sts % 10;
                ans += temp;
                sts /= 10;
            }
            System.out.println(Integer.parseInt(ans));
        }

    }
}
