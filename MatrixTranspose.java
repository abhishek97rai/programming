public class MatrixTranspose {
    
    static void transposeMatrix(int[][] a) {
        int[][] res = new int[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                res[i][j] = a[j][i];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] a = {
            {2, 5, 4},
            {0, 9, 6}
        };
        transposeMatrix(a);
    }
    
}