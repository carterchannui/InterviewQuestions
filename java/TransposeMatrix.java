class Solution {
    public int[][] transpose(int[][] matrix) {
        // Traverse rows.
        for (int i = 0; i < matrix.length; i++) {
            // Traverse columns.
            for (int j = 0; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}
