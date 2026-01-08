// 遞迴題
// 有一程式如下，請在「不修改主函式的前提下」，完成 Reverse 類別
// 的 print 函式，該函式會被傳入的字串「反過來輸出」

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
