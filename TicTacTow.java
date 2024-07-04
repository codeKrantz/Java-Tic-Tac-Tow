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



     /*Individual Row Ckecking 
     Preconditions:
     This function will only be used once the total board checker has returned true to find who won
     checks individual rows to find the winner
      rowNum is an in the board
      Post Conditions:
      returns X for if X's win
      returns O if O's win
      returns None if there is no winner in that row

     */
     public String checkIndividualRow(int rowNum){
        if(gameBoard[rowNum][0].equals("X") && gameBoard[rowNum][1].equals("X") && gameBoard[rowNum][2].equals("X")){
            return "X";
        }
        else if (gameBoard[rowNum][0].equals("O") && gameBoard[rowNum][1].equals("O") && gameBoard[rowNum][2].equals("O")) {
            return "O";
        }
// if this is not the winning row
        return "None";
     }
   



    



    //function to check columns


    //function to check diagonals



    //master check function




    //computer randomized function



    //function to know if the board is completely filled
}