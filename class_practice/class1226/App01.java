class MyCal{

    double sum(double a, double b){
        System.out.println("sum(double a, double b)");
        return a+b;
    }
}
public class App01 {
    public static void main(String[] args) throws Exception {
        int a = 3; //int
        int b = 4;
        System.out.println(new MyCal().sum(a, b));
    }
}
