public class MatrixAddition {
    
    static void checkAndAddMatrices(int[][] a, int[][] b) {
        if(!(a.length == b.length) || !(a[0].length == b[0].length))
            System.out.println("Matrices differ in size, hence cannot be added!");
        else {
            int[][] res = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    res[i][j] = a[i][j] + b[i][j];
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] a = {
            {2, 5, 4, 9},
            {0, 9, 6, 3},
            {1, 1, 4, 7}
        };
        int[][] b = {
            {1, 2, 3, 4},
            {8, 7, 6, 5},
            {0, 1, 2, 3}
        };
        checkAndAddMatrices(a, b);
    }
    
}