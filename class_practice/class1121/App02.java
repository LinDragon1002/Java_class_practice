import java.util.Scanner;

public class App02 {
    
    public static void main(String[] args) {
        // 一個選單，假設有三個選項
        // 其中一個是離開結束程式，另外兩個就簡單輸出使用者輸入的選項
        char input = 'x';
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("(A)就是A啦");
            System.out.println("(B)XB");
            System.out.println("E(x)it");
            System.out.print("請輸入：");
            input = scanner.nextLine().charAt(0);
            switch (input) {
                case 'A': case 'a':
                    System.out.println("你輸入的是 A");
                    break;
                case 'B': case 'b':
                    System.out.println("你輸入的是 B");
                    break;
                case 'X': case 'x':
                    System.out.println("這麼想離開？");
                    break;
                default:
                    System.out.println("不要亂輸入");
                    break;
            }
            System.out.println("==============");
        }while(input != 'X' && input != 'x');

    }
}
