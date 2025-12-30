public class App06 {
    
    public static void main(String[] args) {
        double[] data = new double[] {
            //20.6, -2, 30, -10.2, 4, 5.2, 5, -3
            -1, -3, -5.5, -0.6
        };
        //請輸出這個陣列裡的最大值與最小值、平均值
        double mymax = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i] > mymax){
                mymax = data[i];
            }
        }
        System.out.println(mymax);
    }
}
