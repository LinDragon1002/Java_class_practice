class Student{
    double id;
    String name;
    int[] scores;
    String birth;
}
public class App03 {
    
    public static void main(String[] args) {
        Student std = new Student();
        std.name = "NTUB";
        System.out.println("學生1: " + std.name);

        int n = 5;
        Student[] stds = new Student[n];
        stds[0] = new Student();
        stds[0].name = "你好";
        System.out.println("學生2: " + stds[0].name);
        //std[i].scores[s]
        //代表第i個學生的第s個科目的分數
        //std[i].name
        //代表第i個學生的名字
    }
}
