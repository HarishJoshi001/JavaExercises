import java.util.Scanner;

public class Main {

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println("");
        }
    }

    public static boolean haveWon(char[][] board, char player) {
        //for rows
        for(int row=0; row<board.length; row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        //for cols
        for(int col=0; col<board.length; col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        //for diagonals
        if((board[0][0]==player && board[1][1]==player && board[2][2]==player) || (board[0][2]==player && board[1][1]==player && board[2][0]==player)){
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char player = 'x';
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[row].length; col++){
                board[row][col] = ' ';
            }
        }

        Scanner input = new Scanner(System.in);

        boolean gameOver = false;
        while(!gameOver){
            printBoard(board);
            System.out.print("Player " + player + "'s turn: ");
            int row = input.nextInt();
            int col = input.nextInt();
            if(board[row][col] != ' '){
                System.out.println("Invalid move. Try again.");
            }else{
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver){
                    System.out.println("Player " + player + " won!");
                }else{
                    player = (player == 'x') ? 'o' : 'x';
                }
            }
        }
    }

}