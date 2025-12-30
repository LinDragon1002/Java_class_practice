class Hanoi{

    void move(int n, String from, String middle, String to){
        if(n==1){
            System.out.printf("%s->%s%n", from, to);
        }else{
            move(n-1, from, to,middle);
            System.out.printf("%s->%s%n", from, to);
            move(n-1, middle, from, to);
        }
    }
}
public class App06 {
    
    public static void main(String[] args) {
        new Hanoi().move(6, "A", "B", "C");
    }
}
