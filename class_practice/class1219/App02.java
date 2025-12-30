class TestMethod{

    void fun1(){
        System.out.println("1");
        fun2();
        System.out.println("2");
    }

    void fun2(){
        System.out.println("3");
        fun3();
        System.out.println("4");
    }

    void fun3(){
        System.out.println("5");
    }
}
public class App02 {
    public static void main(String[] args) {
        new TestMethod().fun1();
    }
}
