import java.util.Scanner;

class Reverse{
    void print(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        print(str.substring(1));
        System.out.print(str.charAt(0));
    }
}

public class Y112_6 {
    public static void main(String[] args) {
        new Reverse().print("HelloooWorld");
    }
}
