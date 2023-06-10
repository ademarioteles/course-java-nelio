package chess;

import boardgame.Board;
import boardgame.Position;

public class Pawn extends ChessPiece {
	private ChessMatch chessMatch;

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
		
		Position p = new Position(0, 0);

		if (getColor() == Color.WHITE) {
			p.setValues(position.getRow() - 1, position.getColoumn());
			if (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
				mat[p.getRow()][p.getColoumn()] = true;
			}
			p.setValues(position.getRow() - 2, position.getColoumn());
			Position p2 = new Position(position.getRow() - 1, position.getColoumn());
			if (getBoard().positionExists(p) && !getBoard().thereIsPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColoumn()] = true;
			}
			p.setValues(position.getRow() - 1, position.getColoumn() - 1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColoumn()] = true;
			}			
			p.setValues(position.getRow() - 1, position.getColoumn() + 1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColoumn()] = true;
			}	

		}
		else {
			p.setValues(position.getRow() + 1, position.getColoumn());
			if (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
				mat[p.getRow()][p.getColoumn()] = true;
			}
			p.setValues(position.getRow() + 2, position.getColoumn());
			Position p2 = new Position(position.getRow() + 1, position.getColoumn());
			if (getBoard().positionExists(p) && !getBoard().thereIsPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColoumn()] = true;
			}
			p.setValues(position.getRow() + 1, position.getColoumn() - 1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColoumn()] = true;
			}			
			p.setValues(position.getRow() + 1, position.getColoumn() + 1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColoumn()] = true;
			}
			
		
		}
		return mat;
    }

    @Override
    public String toString() {
        return "♙";
    }

}
