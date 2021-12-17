package juris;

public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(
            ChessBoard chessBoard
            , int startLine
            , int startColumn
            , int endLine
            , int endColumn) {

        if (!isMoveInsideBoard(startLine, startColumn, endLine, endColumn)) return false;
        if (!isStartEndDifferent(startLine, startColumn, endLine, endColumn)) return false;
        if (isMoveEndSameColor(endLine, endColumn, chessBoard)) return false;

        if (!isMoveAccordingHorse(startLine, startColumn, endLine, endColumn)) return false;

            return true;
    }

    private boolean isMoveAccordingHorse(int startLine, int startColumn, int endLine, int endColumn) {
        return endLine == startLine + 1 && endColumn == startColumn + 2
                || endLine == startLine + 1 && endColumn == startColumn - 2
                || endLine == startLine + 2 && endColumn == startColumn + 1
                || endLine == startLine + 2 && endColumn == startColumn - 1
                || endLine == startLine - 1 && endColumn == startColumn + 2
                || endLine == startLine - 1 && endColumn == startColumn - 2
                || endLine == startLine - 2 && endColumn == startColumn + 1
                || endLine == startLine - 2 && endColumn == startColumn - 1;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
