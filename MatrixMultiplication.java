public class MatrixMultiplication {
    
    static void checkAndMultiplyMatrices(int[][] a, int[][] b) {
        if(a[0].length != b.length)
            System.out.println("Cannot be multiplied, since matrices should be of the form MxN and NxP to be multiplied!");
        else {
            int[][] res = new int[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    int sum=0;
                    for (int k = 0; k < b.length; k++) {
                        sum += a[i][k]*b[k][j];
                    }
                    res[i][j] = sum;
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] a = {
            {2, 5, 4},
            {0, 9, 6},
            {1, 1, 4},
            {3, 1, 7}
        };
        int[][] b = {
            {1, 2, 3, 4},
            {8, 7, 6, 5},
            {0, 1, 2, 3}
        };
        checkAndMultiplyMatrices(a, b);
    }
    
}