public class App {
    public static void main(String[] args) throws Exception {
        
        //A->超棒 B->還可以 C->加油 D->要小心  F->明年見
        /*
        if(userinput.compareTo("A") == 0){

        }else if(userinput.compareTo("B") == 0){

        } */
        String userinput = "b";
        switch (userinput) {
            case "A": case "a":
                System.out.println("超棒");
                break;
            case "C": case "c":
                System.out.println("加油");
                break;
            case "D": case "d":
                System.out.println("要小心");
                break;
            case "B": case "b":
                System.out.println("還可以");
                break;
            case "F": case "f":
                System.out.println("明年見");
                break;
            default:
                System.out.println("只能輸入ABCDF喔");
                break;
        }
    }
}
