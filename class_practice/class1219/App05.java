class Fruit {

    //m顆橘子，n顆蘋果
    //只有兩種取法：(1橘子+3蘋果 或 4橘子+1蘋果)
    boolean pick(int m, int n){
        if(m == 0 && n == 0) 
            return true;
        else if(m > 0 && n > 0)
            return pick(m-1, n-3) || pick(m-4, n-1);
        else
            //if(m <= 0 && n > 0) return false;
            //if(n <= 0 && m > 0) return false;
            return false;
    }
}
public class App05 {
    public static void main(String[] args) {
        Fruit check = new Fruit();
        System.out.println(check.pick(30, 31));
        System.out.println(check.pick(3, 3));
        System.out.println(check.pick(5, 4));
        System.out.println(check.pick(20, 5));
        System.out.println(check.pick(21, 8));
        System.out.println(check.pick(21, 9));
    }
}
