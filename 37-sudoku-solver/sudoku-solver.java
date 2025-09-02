class Solution {
    public boolean isValid(char[][] board,int row,int col,char d){
        for(int i=0;i<9;i++){
           if(board[i][col]==d){
            return false;
           }
           if(board[row][i]==d){
            return false;
           } 
        }
        int start_i=row/3*3;
        int start_j=col/3*3;
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                if(board[start_i+k][start_j+l]==d){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char d='1';d<='9';d++){
                        // backtracking so first do
                        if(isValid(board,i,j,d)){
                            board[i][j]=d; 
                    
                        // then explore 
                        if(solve(board)==true){
                            return true;
                        }
                      // and last step undo 
                        board[i][j]='.';
                    }
                }
                return false;
            }
        }
    }
    // matlab sare cells bhare hue honge to true return ho jayega 
    return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}