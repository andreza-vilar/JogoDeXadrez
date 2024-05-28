package boardgame;

public class Position {
    private int row;
    private int columm;


    public Position(int row, int columm) {
        this.row = row;
        this.columm = columm;
    }


    public int getColumm() {
        return columm;
    }

    public void setColumm(int columm) {
        this.columm = columm;
    }

    public int getRow(){
        return row;
    }

    public void setRow(int row){
        this.row = row;
    }

    public void setValue(int row, int columm) {

    }

    @Override
    public String toString() {
        return row + ", " + columm;
    }
}
