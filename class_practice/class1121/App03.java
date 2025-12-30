public class App03 {
    public static void main(String[] args) {
        System.out.println("1==");
        {
            int i = 1;
            while (i <= 10) {
                if(i % 2 == 0){
                    i++;
                    continue;
                }
                System.out.println(i);
                i++;
            }
        }
        System.out.println("2==");
        int i = 1;

        while (i <= 10)
            ;
        {
            System.out.println(i);
            i++;
        }

    }
}
