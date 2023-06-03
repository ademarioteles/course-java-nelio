package boardgame;

public class Piece {
    //Classe para as pecas do tabuleiro
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

}
