package juris;

public abstract class ChessPiece {
    String color;
    boolean check= true;

    public ChessPiece(String color) {
        this.color = color;
    }
    public abstract String getColor();

    public abstract boolean canMoveToPosition();

    public abstract String getSymbol();

}
