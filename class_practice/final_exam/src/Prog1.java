import java.util.Scanner;

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