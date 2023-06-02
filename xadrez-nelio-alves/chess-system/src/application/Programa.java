package application;


import chess.ChessMatch;


public class Programa {

    public static void main(String[] args){

       // Board board = new Board(8, 8);
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}