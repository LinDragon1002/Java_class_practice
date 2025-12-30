class Test{

    Test() {}
    Test(int x, int y){
        System.out.println("這邊是建構");
        System.out.println(x);
        System.out.println(y);
    }

    void test(){
        System.out.println("我只是個函式呼叫");
    }
}
public class App02 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("======分隔線====");
    }
}
