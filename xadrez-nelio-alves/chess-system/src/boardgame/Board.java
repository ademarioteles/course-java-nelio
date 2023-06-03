package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error: É necessario que ao menos exista uma linha ou coluna.");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColums(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public int getColums() {
        return columns;
    }

    public Piece piece(int row, int coloumn) {
        if (!positionExists(row, coloumn)) {
            throw new BoardException("Error: Posição não existente no tabuleiro.");
        }
        return pieces[row][coloumn];
    }

    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Error: Posição não existente no tabuleiro.");
        }
        return pieces[position.getRow()][position.getColoumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsPiece(position)) {
            throw new BoardException("Error:Já existe uma peça nessa posição " + position + ".");
        }
        pieces[position.getRow()][position.getColoumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int coloumn) {
        return row >= 0 && row < rows && coloumn >= 0 && coloumn < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColoumn());
    }

    public boolean thereIsPiece(Position position) {
        return piece(position) != null;
    }

}
