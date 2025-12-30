public class App02 {
    public static void main(String[] args) {
        String[] names = {
            "A", "B", "C", "D", "E", "F"
        };
        int[] scores_java = {
            90, 40, 60, 80, 83, 50
        };
        int[] scores_mg = {
            20, 40, 30, 75, 60, 45
        };
        /**
         * 1. Java最高分的是誰？
         * 2. 請按照java的分數從高到低輸出學生名字
         * 3. 請按照mg的分數從低到高輸出學生名字
         * 4. java不及格的有誰？
         * 5. 請按照「所有課程」的平均分數從低到高輸出學生名字
         * * 請試著將題目改成，使用者會依序輸入n筆資料
         6
         A 90 62
         B 40 30
         C 60 55
         D 80 75
         E 83 88
         F 50 90
         */
        //最高分的是誰？
        int maxScore = -1;
        String topStudent = "";
        for (int i = 0; i < names.length; i++) {
            if (scores_java[i] > maxScore) {
                maxScore = scores_java[i];
                topStudent = names[i];
            }
        }
        System.out.println("最高分的是：" + topStudent + "，分數是：" + maxScore);
        // 4. 不及格的有誰？
        System.out.print("不及格的有：");
        for (int i = 0; i < names.length; i++) {
            if (scores_java[i] < 60) {
                System.out.print(names[i] + " ");
            }
        }
    }
}
