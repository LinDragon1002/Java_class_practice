public class App01 {
    public static void main(String[] args) throws Exception {
        int[][] matrix_1 = {
                { 1, -1 },
                { 2, 3 },
                { 6, -5 }
        };
        int[][] matrix_2 = {
                { 2, -2 },
                { -2, 2 }
        };
        // 請寫出matri_1 x matrix_2 的矩陣運算結果
        // (3x2)x(2x2) => (3x2)
        // 假設目前要計算第[i, j]個的值
        int[][] result = new int[3][2];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < matrix_2.length; k++) {
                    result[i][j] += matrix_1[i][k] * matrix_2[k][j];
                }
            }
        }
        for (int[] row : result) {
            for (int d : row) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
