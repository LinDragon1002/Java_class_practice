import java.util.Scanner;

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

public class Y111_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guess = sc.next();
        String ans = sc.next();
        System.out.println(new Game().compare(guess, ans));
    }
}