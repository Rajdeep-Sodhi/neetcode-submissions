class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*
        use counting sort
        go row by row
        store an 2 2d araylists for columns and sub boxes and one for 
        each iteration during row iternation

        */
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        for(int i = 0; i < 9; i+=3){
            for(int j = 0; j < 9; j+=3){
                int[] subBox = new int[9];
                for(int k = 0; k < 3; k++){
                    for(int l = 0; l < 3; l++){
                        if(board[i+k][j+l] != '.'){
                            int value = (int) board[i+k][j+l] - '1';
                            if(subBox[value] == 1 || rows[i+k][value] == 1 || columns[j+l][value] == 1){
                                return false;
                            }
                            subBox[value]++;
                            rows[i+k][value]++;
                            columns[j+l][value]++;
                        }
                    }
                }
            }
        }
        return true;
    }
}
