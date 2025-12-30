public class App01 {
    public static void main(String[] args) throws Exception {
        
        //A->超棒 B->還可以 C->加油 D->要小心  F->明年見
        String userinput = "B";
        switch (userinput) {
            case "A","a" -> { System.out.println("超棒"); }
            case "C","c" -> System.out.println("加油");
            case "D","d" -> System.out.println("要小心");
            case "B","b" -> System.out.println("還可以");
            case "F","f" ->  System.out.println("明年見");
            default -> System.out.println("只能輸入ABCDF喔");
        }
    }
}
