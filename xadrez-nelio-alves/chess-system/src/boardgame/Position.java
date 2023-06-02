package boardgame;

public class Position {

    private int row;
    private int coloumn;

    public Position(int row, int coloumn) {
        this.row = row;
        this.coloumn = coloumn;
    }

    public int getRow() {
        return row;
    }

    public int getColoumn() {
        return coloumn;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColoumn(int coloumn) {
        this.coloumn = coloumn;
    }

    @Override
    public String toString() {
        return row + ", " + coloumn;
    }

}
