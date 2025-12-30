// static 範例
class A{
    int a;
    static int b;

    void hello2(){
        System.out.println(a);
        System.out.println(b);
    }
    static void hello(){
        //System.out.println(a);
        System.out.println(b);
        System.out.println("hello world");
    }
}
public class App05 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.a = 3;
        a1.b = 10;
        A a2 = new A();
        a2.a = 4;
        a2.b = 20;

        System.out.printf("a1.a=%d, a1.b=%d%n",a1.a, a1.b);
        System.out.printf("a2.a=%d, a2.b=%d%n",a2.a, a2.b);
        System.out.println("A.b = " + A.b);
        A.b = 100;
        System.out.printf("a1.b=%d, a2.b=%d%n", a1.b, a2.b);
        System.out.printf("a1.b=%d, a2.b=%d%n", A.b, A.b);
        A.hello();
    }
}
