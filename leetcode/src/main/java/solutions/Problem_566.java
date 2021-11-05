package solutions;

public class Problem_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // return original array if reshape op is not possible
        if(mat.length * mat[0].length != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];
        int row = 0, col = 0;
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                res[row][col] = ints[j];
                col++;
                if (col == c) {
                    row++;
                    col = 0;
                }
            }
        }
        return res;
    }
}
