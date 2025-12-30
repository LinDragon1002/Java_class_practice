class Std{
    int score_java;
    int score_mg;
    int getScore_java() {
        return score_java;
    }

    void setScore_java(int score_java) {
        if(score_java > 100 || score_java < 0){
            System.out.println("值超過範圍了");
            return;
        }
        this.score_java = score_java;
    }

    int getScore_mg() {
        return score_mg;
    }

    void setScore_mg(int score_mg) {
        this.score_mg = score_mg;
    }

    double score_avg;

    public double getScore_avg() {
        return score_avg;
    }

    double calAvgScore(double w_java, double w_mg){
        this.score_avg = (this.score_java*w_java + this.score_mg*w_mg);
        if(this.score_avg >= 100) this.score_avg = 100;
        if(this.score_avg < 60) this.score_avg = 60;
        return score_avg;
    }

    
}
public class App01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
