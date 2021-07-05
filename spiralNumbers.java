/*
Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

Example

For n = 3, the output should be

spiralNumbers(n) = [[1, 2, 3],
                    [8, 9, 4],
                    [7, 6, 5]]
                    **/
//The hardest part is to find the relationship
int[][] spiralNumbers(int n) {
    int[][] re = new int[n][n];
    for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x;
                // Finds minimum of four inputs
                x = Math.min(Math.min(i, j),
                    Math.min(n - 1 - i, n - 1 - j));
                re[i][j] = (i <= j)?n*n-((n - 2 * x) * (n - 2 * x) -(i - x) - (j - x))+1:n*n-((n - 2 * x - 2) * (n - 2 * x - 2) +(i - x) + (j - x))+1;
            }
    }
    return re;
}
