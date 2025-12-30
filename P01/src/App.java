import java.util.Scanner;

class student {
    String name;
    int score_java;
    int score_mg;
    public int getScore_java() {
        return score_java;
    }
    public void setScore_java(int score_java) {
        this.score_java = score_java;
    }
    public int getScore_mg() {
        return score_mg;
    }
    public void setScore_mg(int score_mg) {
        this.score_mg = score_mg;
    }
}

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] students = { "A", "B", "C", "D", "E", "F" };
        int[] scores_java = { 90, 40, 60, 80, 83, 50 };
        int[] scores_mg = { 20, 40, 30, 75, 60, 45 };
        student[] std = new student[n];
        sc.nextLine();
        for(int i = 0; i <n; i++){
            std[i] = new student();
            String[] temp = sc.nextLine().split(" ");
            std[i].name = temp[0];
            std[i].score_java = Integer.parseInt(temp[1]);
            std[i].score_mg = Integer.parseInt(temp[2]);

        }
        for(int i = 0; i < n; i++){
            System.out.println(std[i]);
        }
    }
}