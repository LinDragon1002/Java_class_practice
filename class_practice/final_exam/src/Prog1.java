import java.util.Scanner;
// 除錯問題
// 預期的結果是讓程式透過使用者輸入字串
// 例如輸入 NTUB，可以順利輸出 “Hello NTUB”
// 輸入 school，可以輸入 Hello school


class Base {
    String name;

    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    void sayHello() {
        System.out.println("Hello " + this.name);
    };
}
public class Prog1 {
 public static void main(String[] args) {
        Base b = new Base();
        Scanner scanner = new Scanner(System.in);
        b.setName(scanner.nextLine());
        b.sayHello();
    }
}