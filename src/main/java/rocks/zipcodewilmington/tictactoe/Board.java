package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        //if favorOfX == favorOfY (
        //it's a tie

        //if it's not a tie, whichever favorOf is true is the winner

        return null;
    }

    public Boolean checkRow(Board board, char xORy){

        for (int row=0; row<3; row++){
            for (int col=0; col<3; col++){

            }
        }
        return null;
    }

    public Boolean checkCol(Board board, char xORy){

        return null;
    }

    public Boolean checkDiag(Board board, char xORy){

        return null;
    }
}
