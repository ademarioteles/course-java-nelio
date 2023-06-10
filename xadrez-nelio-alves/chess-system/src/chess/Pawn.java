package chess;

import boardgame.Board;
import boardgame.Position;

public class Pawn extends ChessPiece {
	private ChessMatch chessMatch;

	public Pawn(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
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
			if (getBoard().positionExists(p) && !getBoard().thereIsPiece(p) && getBoard().positionExists(p2)
					&& !getBoard().thereIsPiece(p2) && getMoveCount() == 0) {
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
			if (position.getRow() == 3) {
				Position left = new Position(position.getRow(), position.getColoumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left)
						&& getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() - 1][left.getColoumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColoumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right)
						&& getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() - 1][right.getColoumn()] = true;
				}
			}

		} else {
			p.setValues(position.getRow() + 1, position.getColoumn());
			if (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
				mat[p.getRow()][p.getColoumn()] = true;
			}
			p.setValues(position.getRow() + 2, position.getColoumn());
			Position p2 = new Position(position.getRow() + 1, position.getColoumn());
			if (getBoard().positionExists(p) && !getBoard().thereIsPiece(p) && getBoard().positionExists(p2)
					&& !getBoard().thereIsPiece(p2) && getMoveCount() == 0) {
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
			if (position.getRow() == 4) {
				Position left = new Position(position.getRow(), position.getColoumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left)
						&& getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() + 1][left.getColoumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColoumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right)
						&& getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() + 1][right.getColoumn()] = true;
				}
			}

		}
		return mat;
	}

	@Override
	public String toString() {
		return "♙";
	}

}
