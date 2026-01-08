import java.util.Scanner;
// 完全二元樹的前序走訪(pre-order)輸出

public class Y113_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] tree = input.split(" ");

        preOrder(tree, 0);
    }

    private static void preOrder(String[] tree, int index) {
        if (index >= tree.length) {
            return;
        }
        System.out.print(tree[index] + " ");

        preOrder(tree, 2 * index + 1);
        preOrder(tree, 2 * index + 2);
    }
}
