package u5pp1;

public class Connect4 {

    public static final int RED_WIN = 0;
    public static final int BLACK_WIN = 1;
    public static final int NO_WINNER = 2;
    public static final int BOTH_WIN = 3;

    public static final int RED = 1;
    public static final int BLACK = -1;
    public static final int EMPTY = 0;

   // implementation here
    /*returns true if all the board spaces have a piece in them. 
    Red pieces are indicated by `1` and black pieces are indicated by `-1`. Empty spaces are indicated by `0`.*/
    public static boolean isFull(int[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    //returns true if the board is a valid configuration. A board is valid if there are no floating pieces.
    public static boolean isBoardValid(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if( board [i][j] == 1 || board [i][j] == -1){
                    for(int k = i+1; k < board.length; k++){
                        if (board[k][j] == 0){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /*returns `RED_WIN` if only red wins, and `BLACK_WIN` if only black wins. Returns `NO_WINNER` if neither have won. 
    Returns `BOTH_WIN` if both red and black have won. Each of these return variables are found at the top of the class.*/
    public static int getWinner(int[][] board){
        if (isVertical(board, BLACK) == true){
            return BLACK_WIN;
        }else if (isVertical(board, RED) == true){
            return RED_WIN;
        } else if(isHorizontal(board, BLACK) == true){
            return BLACK_WIN;
        } else if(isHorizontal(board, RED) == true){
            return RED_WIN;
        }else{
            return NO_WINNER;
        }
            
        }
    
   // It is recommended to use private helper methods

    //horizontal works
    private static boolean isHorizontal(int[][]bord, int num){
        for(int i = 0; i < bord.length; i++){
            for (int j = 0; j < bord[i].length-3; i++){
                if(bord[i][j] == num){
                    if (bord[i][j+1] == num && bord[i][j+2] == num && bord[i][j+3] == num){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isVertical(int[][] bord,int num){
        for(int i = 0; i < bord.length; i++){
            for (int j = 0; j < bord[i].length; i++){
                
            }
        }
        return false;
    }
    }

