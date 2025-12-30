class MyObj{
    int data;

    void setData(int data){
        this.data = data;
    }
    int getData(int data){
        data = -100;
        return this.data;
    }

    void changeValue(int myvar){
        myvar = 10;
    }
}

class MyTest{
    void test(MyObj obj){
        obj.data = 32;
    }

    void test2(MyObj obj){
        obj = new MyObj();
        obj.data = 43;
    }

    MyObj test3(MyObj obj){
        obj = new MyObj();
        obj.data = 65;
        return obj;
    }
}

public class App05 {
    public static void main(String[] args) throws Exception {
        MyObj obj = new MyObj();
        obj.data = 10;
        System.out.println(obj.data);
        obj.setData(50);
        System.out.println("obj.data=" + obj.data);
        System.out.println(obj.getData(-20));

        //變數
        int myvar = 100;
        obj.changeValue(myvar);
        System.out.println("myvar=" + myvar);

        MyTest myTest = new MyTest();
        myTest.test(obj);
        System.out.println(obj.data);
        myTest.test2(obj);
        System.out.println(obj.data);
        obj = myTest.test3(obj);
        System.out.println(obj.data);
    }
}
