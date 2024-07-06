public class TicTacTow{
    private String[][] gameBoard;
    private String playerLetter;
    private String computerLetter;
    
    
    
    public TicTacTow(String[][] gameArr, String player, String computer){
        gameBoard = gameArr;
        //set all spots to Open with the letter N
        for(int r = 0; r < gameBoard.length; r++){
            for (int c = 0; c < gameBoard[0].length; c++){
                gameBoard[r][c] = "N";
            }
    
        }
        playerLetter = player;
        computerLetter = computer;
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
   



    


    /*Check All Rows Function 
     * Pre-Conditions:
     * Game Board contains only X, O, or N
     * Post-Conditions:
     * returns True if there is a three in a row in any one column for X or O
    */
    public boolean ckeckColumns(){
        for(int c = 0; c < gameBoard[0].length; c++){
            if(gameBoard[0][c].equals("N") == false && gameBoard[0][c].equals(gameBoard[1][c]) && gameBoard[1][c].equals(gameBoard[2][c])){
                return true;
            }
        }
        return false;
    }


    // function to check individual row
    /*Individual Row Checking Function
     * Pre-Conditions:
     * colNum is an acceptable value
     * The board has a three in a row a column\
     * Post-Conditions:
     * Returns which letter has a three in a row
     * If there is no winner the functions returns the string "None"
    */
    public String checkIndividualColumn(int colNum){
        if(gameBoard[0][colNum].equals("X") && gameBoard[1][colNum].equals("X") && gameBoard[2][colNum].equals("X")){
            return "X";
        }

        else if(gameBoard[0][colNum].equals("O") && gameBoard[1][colNum].equals("O") && gameBoard[2][colNum].equals("O")){
            return "O";
        }




        return "None";
    }


    
    /*Function to check both diagonals
     *Pre-Conditions:
     The board is filled with X, O, or N
     Post-Conditions: 
     returns true if there is a three in a row or returns false if there is none
     */

   
   public boolean checkDiagonals(){
    // Starting from the top left corner to the bottem right
    String[] left = new String[]{gameBoard[0][0], gameBoard[1][1], gameBoard[2][2]};

    //Starting from the top right corner and goes to the bottem left corner
    String[] right = new String[] {gameBoard[0][2], gameBoard[1][1], gameBoard[2][0]};


    //checking for three in a row
    boolean leftSide = true;
    for(int i = 0; i < left.length; i++){
        if(left[i].equals("N")){
            leftSide = false;
            break;
        }
    }

    boolean rightSide = true;
    for(int i = 0; i < right.length; i++){
        if(right[i].equals("N")){
            rightSide = false;
            break;
        }
    }

    if(leftSide||rightSide){
        return true;
    }

    return false;

   }



/*
 * Individual diagonal checker function
 * Pre-Condition: 
 * there is a three in a row for one of the diagonals
 * side is a valid answer that is either left or right
 * the board is filled with X, O, or N
 * Post-Condtions:
 * Returns X or O depending on who won
 * Returns None if the diagnoal is not three in a row
 */
public String checkIndividualDiagonal(String side){
    // Starting from the top left corner to the bottem right
    String[] left = new String[]{gameBoard[0][0], gameBoard[1][1], gameBoard[2][2]};

    //Starting from the top right corner and goes to the bottem left corner
    String[] right = new String[] {gameBoard[0][2], gameBoard[1][1], gameBoard[2][0]};

    if(side.equals("left")){
        if(left[0].equals("N") == false && left[0].equals(left[1])&&left[1].equals(left[2])){
            return left[0];
        }
    }
    else if(side.equals("right")){
        if(right[0].equals("N") == false && right[0].equals(right[1])&&right[1].equals(right[2])){
            return right[0];
        }
    }
    
    return "None";
}

/*Master Check function
 * Pre-Condition:
 * All methods used in this work
 * The board is filled with X, O, or N
 * Post-Condtions:
 * The winning letter will be returned
 * None will be returned if there is no winner still
 */
public String masterCheck(){
//starting with rows
if(ckeckRows()){
    for(int i = 0; i < 3; i++){
        if(checkIndividualRow(i).equals("X")||checkIndividualRow(i).equals("O")){
            return checkIndividualRow(i);
        }
    }
}


//columns next
else if(ckeckColumns()){
    for(int i = 0; i < 3; i++){
        if(checkIndividualColumn(i).equals("X")||checkIndividualColumn(i).equals("O")){
            return checkIndividualColumn(i);
        }
    }
}


//diagonals last
else if(checkDiagonals()){
    if(checkIndividualDiagonal("left").equals("X")||checkIndividualDiagonal("left").equals("O")){
        return checkIndividualDiagonal("left");
    }

    else if(checkIndividualDiagonal("right").equals("X")||checkIndividualDiagonal("right").equals("O")){
        return checkIndividualDiagonal("right");
    }
}




return "None";
}
    // cats game cheacker

public boolean catsGameCheck(){
    if (masterCheck().equals("None")) {
        for(int r = 0; r < gameBoard.length; r++){
            for(int c = 0; c < gameBoard[0].length; c++){
                if(gameBoard[r][c].equals("N")){
                    return false;
                }
            }
        }
        return true;
    }
    return false;
}


    // set funciton

    //computer randomized selection function



    //function to know if the board is completely filled
}