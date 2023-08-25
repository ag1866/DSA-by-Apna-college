public class nqueen {
// is asfe function check krega ki queen ko wha baithana safe h y nhi
    public static boolean isSafe(int row, int col, char[][] board){
        
        // horizontal
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
// iska mtlb agr us row aur us j column m already koi queen baithi hui h
// to us jagah pr dusri queen ko bithana safe nhi h
                return false;
            }
        }
        // vertical
        for(int i = 0; i<board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // upper left
        int r = row;
        // r-- aur c-- isliye liya kyuki dono upper left m jarhe h tp row bhi ek kam horhi h aur column bhi

        for(int c=col; c>=0 && r>=0; c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // upper right
        r = row;
        for(int c=col; col<board.length && r>=0; r--, c++ ){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower right
        for(int c=col; c<board.length && r<board.length; c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;

    }
    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
      
        for(int i=0; i<board.length; i++) {
            row = "";
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
       
        allBoards.add(newBoard);
    }
    // is helper function ki help se apn backtracking krenge
    public void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        // ab apn row m ek ek krke queen ko place krenge
        for(int row=0; row<board.length; row++){
            if(isSafe(row, col, board)){
                // agr board pr safe h to hm wueen ko place krdenge
                board[row][col] = 'Q';
// ab helper function ki help se agli queen ko place kraenge agle column m
                helper(board, allBoards, col+1);
                board[row][col] = '.'; 

            }
        }
    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        //  apn ne ek 2d character array define kiya h taki asan ho 
        // question ko solve krna
        // board mtlb chess board
        helper(board, allBoards,0);
        return allBoards;

    }
}
