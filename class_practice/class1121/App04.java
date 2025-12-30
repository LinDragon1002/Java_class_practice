public class App04 {
    
    public static void main(String[] args) {
        int a = 3;
        int[] myarray;
        int n = 5;
        myarray = new int[n];
        myarray[0] = 10;
        myarray[1] = 20;
        myarray[3] = -2;
        myarray[4] = 100;
        //myarray[5] = 100;

        System.out.println(myarray[1]);
        System.out.println("==== 人生無意義分隔線  ===");
        /////////////////////////////////
        System.out.println(myarray);
        System.out.println(myarray[2]);
        //System.out.println(myarray[5]);

        myarray = new int[] {-5, -3, -2, 1, 2, 4, 6};
        int[] myarray2 = {-5, -3, -2, 1, 2, 4, 6};
        //int[] myarray2 = new int[]{-5, -3, -2, 1, 2, 4, 6};
        //myarray2 = {-5, -3, -2, 1, 2, 4, 6}
        //上面這行的語法會出錯

        //使用迴圈把 myarray 裡面的每個數字都印出來
        for(int i=0;i<myarray.length;i++){
            System.out.println(myarray[i]);
        }
    }
}
