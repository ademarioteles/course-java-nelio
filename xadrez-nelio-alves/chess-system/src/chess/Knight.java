package chess;

import boardgame.Board;
import boardgame.Position;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "♘";
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
		
		Position p = new Position(0, 0);
		
		p.setValues(position.getRow() - 1, position.getColoumn() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColoumn()] = true;
		}

		p.setValues(position.getRow() - 2, position.getColoumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColoumn()] = true;
		}

		p.setValues(position.getRow() - 2, position.getColoumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColoumn()] = true;
		}

		p.setValues(position.getRow() - 1, position.getColoumn() + 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColoumn()] = true;
		}

		p.setValues(position.getRow() + 1, position.getColoumn() + 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColoumn()] = true;
		}

		p.setValues(position.getRow() + 2, position.getColoumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColoumn()] = true;
		}

		p.setValues(position.getRow() + 2, position.getColoumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColoumn()] = true;
		}
		
		p.setValues(position.getRow() + 1, position.getColoumn() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColoumn()] = true;
		}

		return mat;
    }

}
