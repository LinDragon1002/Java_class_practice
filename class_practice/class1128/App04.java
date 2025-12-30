public class App04 {
    
    /**
     * int[] scores = { 90, 40, 60, 80, 83, 50 };
     * 泡泡排序法 (Bubble Sort)，從小到大排序
     * 
     */
    public static void main(String[] args) {
        int[] scores = { 90, 40, 60, 80, 83, 50 };
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        for (int score : scores) {
            System.out.println(score);
        }
    }
}
