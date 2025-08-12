class Main{
    public static void main(String[] args){
        String[][] board = new String[3][3];

        System.out.print("Hello");
        System.out.println("Welcome to Terminal TicTakTow!");
        //the player and computer letters can change in the game
        TicTacTow game = new TicTacTow(board, "X", "O");
        game.ticTacTow();
        game.printBoard();
    }
}

//this is a small change becasue I needed to commit on a different computer