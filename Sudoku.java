/*
Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.
*/
//Its redundant
boolean sudoku(int[][] grid) {
    int hor = grid[0].length/3;
    int ver = grid.length/3;
    for(int i=0;i<ver;i++){
        for(int j=0;j<hor;j++){
            Stack<Integer> check = new Stack<Integer>();
            for(int s=0;s<3;s++){
                for(int d=0;d<3;d++){
                    if(check.contains(grid[i*3+s][j*3+d])){return false;}
                    else{check.add(grid[i*3+s][j*3+d]);}
                }
            }
        }
    }
    for(int i=0;i<ver*3;i++){
        Stack<Integer> hcheck = new Stack<Integer>();
        for(int j=0;j<hor*3;j++){
            if(hcheck.contains(grid[i][j])){return false;}
                    else{hcheck.add(grid[i][j]);}
        }
    }
    for(int i=0;i<hor*3;i++){
        Stack<Integer> vcheck = new Stack<Integer>();
        for(int j=0;j<ver*3;j++){
            if(vcheck.contains(grid[j][i])){return false;}
                    else{vcheck.add(grid[j][i]);}
        }
    }
    return true;
}
