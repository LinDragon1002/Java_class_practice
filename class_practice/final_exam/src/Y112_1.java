import java.util.Scanner;
// 幾A幾B程式判斷
// 輸入
// 1234 2054
// 輸出
// 1A1B

class Game {
    String compare(String guess, String ans) {
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == ans.charAt(i)) {
                countA++;
            }
        }

        for (int i = 0; i < guess.length(); i++) {
            for (int j = 0; j < ans.length(); j++) {
                if (i != j && guess.charAt(i) == ans.charAt(j)) {
                    countB++;
                    break;
                }
            }
        }

        return countA + "A" + countB + "B";
    }
}

public class Y112_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sts = sc.nextLine().split(" ");
        String guess = sts[0];
        String ans = sts[1];
        System.out.println(new Game().compare(guess, ans));
    }
}