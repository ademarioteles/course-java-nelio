package chess;

import boardgame.Board;
import boardgame.Position;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int x = 0; x < board.getColums(); x++) {
                mat[i][x] = (ChessPiece) board.piece(i, x);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board,Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));

    }

}
