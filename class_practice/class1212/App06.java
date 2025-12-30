class MyObjArray{
    void change(int[] data){
        data[0] = -20;
    }
}
public class App06 {
    public static void main(String[] args) {
        MyObjArray mArray = new MyObjArray();
        int[] data = {10, 20, 30, 40};
        mArray.change(data);
        for (int d : data) {
            System.out.println(d);
        }
    }
}
