import java.util.Scanner;
// 三個矩陣相乘

public class Y113_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        int[][] matrix2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int rows3 = scanner.nextInt();
        int cols3 = scanner.nextInt();

        int[][] matrix3 = new int[rows3][cols3];
        for (int i = 0; i < rows3; i++) {
            for (int j = 0; j < cols3; j++) {
                matrix3[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        int[][] result2 = new int[rows1][cols3];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols3; j++) {
                result2[i][j] = 0;
                for (int k = 0; k < cols2; k++) {
                    result2[i][j] += result[i][k] * matrix3[k][j];
                }
            }
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols3; j++) {
                System.out.print(result2[i][j]);
                if (j < cols3 - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
