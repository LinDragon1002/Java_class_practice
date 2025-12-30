public class App01 {
    public static void main(String[] args) throws Exception {
        int[] numbers = {10, -2, 33, 47, -5, 0, 18};
        // 0. 輸出所有的值
        for (int i : numbers) {
            System.out.println(i);
        }
        // 1. 算出平均值
        int mysum = 0;
        for (int i = 0; i < numbers.length; i++) {
            mysum += numbers[i];
        }
        System.out.printf("%.3f%n", (double)mysum/numbers.length);
        // 2. 找出最大值
        numbers = new int[]{-10, -2, -33, -47, -5, -1, -18};
        int mymax = numbers[0];
        int maxindex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > mymax){
                mymax = numbers[i];
                maxindex = i;
            }
        }
        System.out.println(mymax);
        // 3. 找出最大值的位置
        System.out.printf("最大值%d是第%d個數字%n",mymax, maxindex+1);
    }
}
