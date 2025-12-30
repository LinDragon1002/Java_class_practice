public class App05 {
    
    public static void main(String[] args) {
        int[][] array2d = new int[2][4];
        array2d = new int[][]{ {1, 2, 3, 4} , {5, 6, 7, 8} };
        System.out.println(array2d.length);
        System.out.println(array2d[0].length);
        int[] array1d = array2d[1];
        System.out.println(array1d.length);
        System.out.println(array2d[0][2]);

        ////////////////////////////////
        int[][] array2d_2 = new int[][] {{1}, {2, 3, 4}};
        for (int i = 0; i < array2d_2.length; i++) {
            for (int j = 0; j < array2d_2[i].length; j++) {
                System.out.print(array2d_2[i][j] + " ");
            }
            System.out.println();
        }
        ////////////////////////////////
        int[] test = new int[5];
        int[][] array2d_3 = new int[3][];
        array2d_3[0] = new int[2];
        array2d_3[1] = new int[3];
        array2d_3[2] = test;
    }
}
