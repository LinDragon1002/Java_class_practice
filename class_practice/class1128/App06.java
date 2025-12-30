public class App06 {
    
    /**
    假設資料如下
    20 30 10 50 40
    25 35 15 45 55
    10 22 33 44 55
     5 15 25 35 45
    30 12 53 34 45
    80 70 60 50 40
    請寫一程式將資料讀入一二維陣列，
    1. 計算每一列的平均值，最後輸出
    2. 計算每一縱行的平均值，最後輸出
    3. 計算整個二維陣列的平均值，最後輸出
     */
    public static void main(String[] args) {
        int[][] data = {
            {20, 30, 10, 50, 40},
            {25, 35, 15, 45, 55},
            {10, 22, 33, 44, 55},
            { 5, 15, 25, 35, 45},
            {30, 12, 53, 34, 45},
            {80, 70, 60, 50, 40}
        };
        for (int[] row : data) {
            int mysum = 0;
            for (int d : row) {
                mysum += d;
            }
            System.out.println((double)mysum/row.length);
        }
        //data[0][0] + data[1][0] + data[2][0] + data[3][0] + data[4][0] + data[5][0]
        int mysum = 0;
        for(int i=0;i<data.length;i++){
            mysum = data[i][0];
        }
        System.out.println((double)mysum/data.length);
    }
}
