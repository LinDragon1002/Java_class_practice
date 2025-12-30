class MyTest2{

    static int x = 10;

    MyTest2(){
        x = 20;
    }

    static {
        x = 30;
    }
}

public class App06 {
    public static void main(String[] args) {
        System.out.println(MyTest2.x);
        System.out.println(new MyTest2().x);
        System.out.println(MyTest2.x);

    }
}
