class Std{
    String name;
    int java;
    int mg;
    double avgScore;

    double calAvgScore(double w_java, double w_mg){
        this.avgScore = (this.java*w_java + this.mg*w_mg);
        if(this.avgScore >= 100) this.avgScore = 100;
        if(this.avgScore < 60) this.avgScore = 60;
        return avgScore;
    }

    void printNameAndAvg(){
        System.out.printf("%3s:%9.3f%n", this.name, this.avgScore);
    }
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
            //stds[i].avgScore = (stds[i].java + stds[i].mg)/2.0;
            stds[i].calAvgScore(0.8, 0.5);
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

        // 4. 請按照平均分數從低到高輸出學生名字
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (stds[j].avgScore > stds[j + 1].avgScore) {
                    Std temp = stds[j];
                    stds[j] = stds[j + 1];
                    stds[j + 1] = temp;
                }
            }
        }
        System.out.println("按照平均分數從低到高輸出學生名字：");
        for (Std std : stds) {
            std.printNameAndAvg();
        }
    }
}
