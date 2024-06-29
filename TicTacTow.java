public class TicTacTow{
    private String[][] gameBoard;
    
    
    
    public TicTacTow(String[][] gameArr){
        gameBoard = gameArr;
        //set all spots to Open with the letter N
        for(int r = 0; r < gameBoard.length; r++){
            for (int c = 0; c < gameBoard[0].length; c++){
                gameBoard[r][c] = "N";
            }
    
        }
    }
 


    // function to print the board
    public  void printBoard(){
        for(int r = 0; r < gameBoard.length; r++){
            System.out.println(gameBoard[r][0]+"|"+gameBoard[r][1]+"|"+gameBoard[r][2]);
            if(r < 2){
                System.out.println("-----");
            }
        }
    }



    /*Checking Rows Function
     * Preconditions: 
     * the board only conatins X, O, or N
     * 
     * Postconditions:
     * False measns that there is no three in a row for X or O
     * True means that there is a three in a row 
     */

     public boolean ckeckRows(){
        
        for(int r = 0; r < gameBoard.length; r++){
            if(gameBoard[r][0].equals("N") == false && gameBoard[r][0].equals(gameBoard[r][1]) && gameBoard[r][1].equals(gameBoard[r][2])){
                return true;
            }
        }
        return false;
     }
    



    //function to check columns


    //function to check diagonals



    //master check function




    //computer randomized function



    //function to know if the board is completely filled
}