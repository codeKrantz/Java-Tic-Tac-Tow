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



    //function to check rows



    //function to check columns


    //function to check diagonals



    //master check function




    //computer randomized function



    //function to know if the board is completely filled
}