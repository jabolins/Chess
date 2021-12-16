package juris;

public class Horse extends ChessPiece{
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public boolean canMoveToPosition() {
        return false;
    }

    @Override
    public String getSymbol() {
        return null;
    }
}
