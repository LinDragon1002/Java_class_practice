class Rect{
    private double width;
    private double height;
    public Rect(double width, double height){
        if(width <= 0 || height <=0){
            System.out.println("設定錯誤！");
        }else{
            this.width = width;
            this.height = height;
        }
    }

    public Rect(double x1,double y1,double x2,double y2){
        this.width = Math.abs(x2-x1);
        this.height = Math.abs(y2-y1);
    }
    public double area() {
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }
}
public class App03 {
    public static void main(String[] args) {
        Rect rect1 = new Rect(10.2, 3);
        //寬 10.2  高3
        System.out.println("Rect-1: 面積: " + rect1.area()); //輸出面積
        Rect rect3 = new Rect(2.5, 2.5);
        System.out.println("Rect-3: 面積:" + rect3.area()); //輸出面積
        System.out.println("Rect-3: 周長:" + rect3.getPerimeter()); //輸出面積
        Rect rect2 = new Rect(0.0, 0.0, 10.2, 3);
        //左上點的座標(0, 0) ，右下的座標(10.2, 3)
        //rect2.width = -10;
        System.out.println(rect2.area()); //輸出面積
    }
}
