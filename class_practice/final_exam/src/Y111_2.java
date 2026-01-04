import java.util.Scanner;

public class Y111_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        char[] c_nums = nums.toCharArray();

        int[] permutations = new int[6];
        int originalNum = Integer.parseInt(nums);
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && j != k && i != k) {
                        String numStr = "" + c_nums[i] + c_nums[j] + c_nums[k];
                        int num = Integer.parseInt(numStr);

                        if (num != originalNum) {
                            permutations[count] = num;
                            count++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (permutations[j] < permutations[j + 1]) {
                    int temp = permutations[j];
                    permutations[j] = permutations[j + 1];
                    permutations[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(permutations[i]);
        }

        sc.close();
    }
}
