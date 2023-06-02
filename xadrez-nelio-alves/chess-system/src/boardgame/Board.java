package boardgame;

public class Board {
    private int rows;
    private int colums;
    private Piece[][] pieces;

    public Board(int rows, int colums) {
        this.rows = rows;
        this.colums = colums;
        pieces = new Piece[rows][colums];
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColums(int colums) {
        this.colums = colums;
    }

    public int getRows() {
        return rows;
    }

    public int getColums() {
        return colums;
    }

    public Piece piece(int row, int coloumn) {
        return pieces[row][coloumn];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColoumn()];
    }

    public void placePiece(Piece piece, Position position) {
        pieces[position.getRow()][position.getColoumn()] = piece;
        piece.position = position;
    }

}
