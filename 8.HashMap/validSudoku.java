class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] subMatrix = new boolean[9][9];
        int R=board.length,C=board[0].length,X;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(board[i][j]!='.'){
                    X=board[i][j]-'0'-1;
                    if(row[i][X] || column[j][X] || subMatrix[((i/3)*3)+(j/3)][X]){
                        return false;
                    }
                    row[i][X]=true;
                    column[j][X]=true;
                    subMatrix[((i/3)*3)+(j/3)][X]=true;
                }
            }
        }
        return true;
    }
}
