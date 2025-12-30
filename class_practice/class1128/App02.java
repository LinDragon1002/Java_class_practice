public class App02 {
    public static void main(String[] args) {
        String[] names = {
            "A", "B", "C", "D", "E", "F"
        };
        int[] scores = {
            90, 40, 60, 80, 83, 50
        };
        /**
         * 1. 最高分的是誰？
         * 2. 最低分的是誰？ 幾分？
         * 3. 全班平均分數是多少？ (到小數點第3位)
         * 4. 不及格的有誰？
         * 5. 低於平均有「幾位」？
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
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                topStudent = names[i];
            }
        }
        System.out.println("最高分的是：" + topStudent + "，分數是：" + maxScore);
        // 4. 不及格的有誰？
        System.out.print("不及格的有：");
        for (int i = 0; i < names.length; i++) {
            if (scores[i] < 60) {
                System.out.print(names[i] + " ");
            }
        }
    }
}
