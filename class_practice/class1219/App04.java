class MyTest{

    int mysum(int n){
        if(n==1) 
            return 1;
        return mysum(n-1)+n;
    }

    //這時候的n代表第n個，不是數字n
    int myfib(int n){
        if(n == 1 || n == 2) 
            return 1;
        return myfib(n-1) + myfib(n-2);
    }
}
public class App04 {
    
    public static void main(String[] args) {
        System.out.println(new MyTest().mysum(10));
        System.out.println(new MyTest().myfib(10));
    }
}
