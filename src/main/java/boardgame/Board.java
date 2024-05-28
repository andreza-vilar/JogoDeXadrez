package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece [][] pieces;

    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1) {
            throw new BoardException("Error: rows and/or columns must be greater than 0");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column) {
        if(!positionsExists(row, column)) {
            throw new BoardException("Error: position does not exist");
        }

        return pieces[row][column];
    }

    public Piece piece(Position position){
        if(!positionsExists(position)) {
            throw new BoardException("Error: position does not exist");
        }

        return pieces[position.getRow()][position.getColumm()];
    }

    public void placePieces(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardException("Error: thereIsAPiece already exists" + position);
        }

        pieces[position.getRow()][position.getColumm()] = piece;
        piece.position = position;
    }

    private boolean positionsExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionsExists(Position position){
        return positionsExists(position.getRow(), position.getColumm());
    }

    public boolean thereIsAPiece(Position position) {
        if(!positionsExists(position)) {
            throw new BoardException("Error: thereIsAPiece does not exist");
        }
        return piece(position) != null;
    }

}
