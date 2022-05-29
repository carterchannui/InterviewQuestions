public static int flippingMatrix(List<List<Integer>> matrix) {
    // Get size of submatrix.
    int n = matrix.size() / 2;
    int max_sum = 0;

    // Maximize each individual value of the sub matrix.
    for (int i = 0; i < n; i++) {
        // Focus individual cell.
        for (int j = 0; j < n; j++) {
            // Add max possible element value to the hollistic sum.
            // There are 4 possible values for each element.
            max_sum += Math.max(
                    Math.max(
                    // Compare submatrix element to its column mirror element.
                    Math.max((matrix.get(i).get(j), matrix.get(matrix.size() - 1 - i)).get(j)),
                    // Compare submatrix element to its row mirror element.
                    Math.max(matrix.get(i).get(j), matrix.get(i).get(matrix.size() - 1 - j))),
                    // Compare submatrix element to its diagonal mirror element.
                    Math.max(matrix.get(i).get(j), matrix.get(matrix.size() - 1 - i).get(matrix.size() - 1 - j)));
        }
    }
    return max_sum;
}
