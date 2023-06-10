package chess;

import boardgame.Board;
import boardgame.Position;

public class King extends ChessPiece {
    private ChessMatch chessMatch;

    public King(Board board, Color color, ChessMatch chessMatch) {
        super(board, color);
        this.chessMatch = chessMatch;
    }

    @Override
    public String toString() {
        return "♔";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
        Position p = new Position(0, 0);

        p.setValues(position.getRow() - 1, position.getColoumn());
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        p.setValues(position.getRow(), position.getColoumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        p.setValues(position.getRow(), position.getColoumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        p.setValues(position.getRow() - 1, position.getColoumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        p.setValues(position.getRow() - 1, position.getColoumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        p.setValues(position.getRow() + 1, position.getColoumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        p.setValues(position.getRow() + 1, position.getColoumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColoumn()] = true;
        }

        if (getMoveCount() == 0 && !chessMatch.getCheck()) {

            Position posT1 = new Position(position.getRow(), position.getColoumn() + 3);
            if (testRookCastling(posT1)) {
                Position p1 = new Position(position.getRow(), position.getColoumn() + 1);
                Position p2 = new Position(position.getRow(), position.getColoumn() + 2);
                if(getBoard().piece(p1) == null && getBoard().piece(p2) == null){
                    mat[position.getRow()][position.getColoumn() + 2] = true;
                }
            }

            Position posT2 = new Position(position.getRow(), position.getColoumn() - 4);
            if (testRookCastling(posT2)) {
                Position p1 = new Position(position.getRow(), position.getColoumn() - 1);
                Position p2 = new Position(position.getRow(), position.getColoumn() - 2);
                Position p3 = new Position(position.getRow(), position.getColoumn() - 3);

                if(getBoard().piece(p1) == null && getBoard().piece(p2) == null && getBoard().piece(p3) == null){
                    mat[position.getRow()][position.getColoumn() - 2] = true;
                }
            }
        }

        return mat;
    }

    private boolean testRookCastling(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p instanceof Rook && p.getColor() == getColor() && p.getMoveCount() == 0;
    }

}
