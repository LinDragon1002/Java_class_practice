import java.util.Scanner;

public class MYFIB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        if (index == 0) {
            System.out.println(0);
        } else if (index == 1 || index == 2) {
            System.out.println(1);
        } else {
            long[] values = new long[index + 1];
            values[0] = 0;
            values[1] = 1;
            values[2] = 1;

            for (int i = 3; i <= index; i++) {
                values[i] = values[i - 3] + values[i - 2];
            }
            System.out.println(values[index]);
        }
    }
}
