package chess;

import boardgame.Board;
import boardgame.Position;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "♗";
    }

    @Override
    public boolean[][] possibleMoves() {

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
        Position p = new Position(0, 0);
        // Teste para cima
        p.setValues(position.getRow() - 1, position.getColoumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
            p.setValues(p.getRow() - 1, p.getColoumn() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        p.setValues(position.getRow() - 1, position.getColoumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
            p.setValues(p.getRow() - 1, p.getColoumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        p.setValues(position.getRow() + 1, position.getColoumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
            p.setValues(p.getRow() + 1, p.getColoumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }
        // Teste para baixo
        p.setValues(position.getRow() + 1, position.getColoumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
            p.setValues(p.getRow() + 1, p.getColoumn() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        return mat;
    }

}
