/*Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

Example

For

matrix = [[1, 2, 1],
          [2, 2, 2],
          [2, 2, 2],
          [1, 2, 3],
          [2, 2, 1]]
the output should be
differentSquares(matrix) = 6.

Here are all 6 different 2 × 2 squares:
*/
int differentSquares(int[][] matrix) {
    if(matrix.length-2<=0 || matrix[0].length-2<=0){return 0;}
    Stack<String> check = new Stack<String>();
    for(int i=0;i<matrix.length-1;i++){
        for(int j=0;j<matrix[0].length-1;j++){
            String temp = "";
            temp+=matrix[i][j];
            temp+=matrix[i][j+1];
            temp+=matrix[i+1][j];
            temp+=matrix[i+1][j+1];
            if(!check.contains(temp)){
                check.add(temp);
            }
        }
    }
    return check.size();

}
