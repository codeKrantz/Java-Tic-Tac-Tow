class Main{
    public static void main(String[] args){
        String[][] board = new String[3][3];



        TicTacTow game = new TicTacTow(board, "X", "O");
        game.printBoard();
    }
}