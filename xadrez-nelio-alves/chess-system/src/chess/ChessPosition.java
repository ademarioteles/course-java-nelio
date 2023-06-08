package chess;

import boardgame.Position;

public class ChessPosition {
    private char coloumn;
    private int row;

    public ChessPosition(char coloumn, int row) {
        if (coloumn < 'a' || coloumn > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error: Valores só podem ser de a1 á h8.");
        }
        this.coloumn = coloumn;
        this.row = row;
    }

    public char getColoumn() {
        return coloumn;
    }

    public int getRow() {
        return row;
    }
    protected Position toPosition(){
        return new Position(8 - row, coloumn - 'a');

    }
    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' + position.getColoumn()),8 - position.getRow());
    }
    @Override
    public String toString(){
        return "" + coloumn + row;
    }
}
