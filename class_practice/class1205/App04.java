class Std{
    String name;
    int java;
    int mg;
}

 /**
  * 1. Java最高分的是誰？
  * 2. 請按照java的分數從高到低輸出學生名字
  * 3. 請按照mg的分數從低到高輸出學生名字
  * 4. java不及格的有誰？
  * 5. 請按照「所有課程」的平均分數從低到高輸出學生名字
  */
public class App04 {
    public static void main(String[] args) {
        int n = 6;
        Std[] stds = new Std[n];
        String[] names = {"A", "B", "C", "D", "E", "F"};
        int[] scores_java = {90, 40, 60, 80, 83, 50};
        int[] scores_mg = {20, 40, 30, 75, 60, 45};
        for (int i = 0; i < n; i++) {
            stds[i] = new Std();
            stds[i].name = names[i];
            stds[i].java = scores_java[i];
            stds[i].mg = scores_mg[i];
        }
        Std maxStd = stds[0];
        for (int i = 1; i < n; i++) {
            if (stds[i].java > maxStd.java) {
                maxStd = stds[i];
            }
        }
        System.out.println("Java最高分的是：" + maxStd.name + "，分數是：" + maxStd.java);
        // 2. 請按照java的分數從高到低輸出學生名字
        // 使用簡單的氣泡排序法
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (stds[j].java < stds[j + 1].java) {
                    Std temp = stds[j];
                    stds[j] = stds[j + 1];
                    stds[j + 1] = temp;
                }
            }
        }
        System.out.println("Java分數從高到低排序：");
        for (int i = 0; i < n; i++) {
            System.out.println(stds[i].name + ": " + stds[i].java);
        }
    }
}
