package test;

import juris.ChessBoard;
import juris.Horse;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    @org.junit.jupiter.api.Test
    void getColorWhite() {
        Horse horse = new Horse("White");
        String expectedValue = "White";
        assertEquals(expectedValue, horse.getColor());
    }

    @org.junit.jupiter.api.Test
    void getColorBlack() {
        Horse horse = new Horse("Black");
        String expectedValue = "Black";
        assertEquals(expectedValue, horse.getColor());
    }

    @org.junit.jupiter.api.Test
    void canMoveToPosition() {
        ChessBoard chessBoard = new ChessBoard("Player1");
        Horse horse = new Horse("White");
        assertTrue(horse.canMoveToPosition(chessBoard,1,1,2,3), "Horse can move");
    }

    @org.junit.jupiter.api.Test
    void movetOutboard() {
        ChessBoard chessBoard = new ChessBoard("Player1");
        Horse horse = new Horse("White");
        assertFalse(horse.canMoveToPosition(chessBoard,-1,1,2,3), "start line -1");
        assertFalse(horse.canMoveToPosition(chessBoard,1,-1,2,3), "start column -1");
        assertFalse(horse.canMoveToPosition(chessBoard,1,1,-1,2), "end line -1");
        assertFalse(horse.canMoveToPosition(chessBoard,1,1,2,-1), "end column -1");

        assertFalse(horse.canMoveToPosition(chessBoard,7,7,8,5), "end line 8");
        assertFalse(horse.canMoveToPosition(chessBoard,7,7,5,8), "end column 8");
    }

    @org.junit.jupiter.api.Test
    void moveTheSameColor() {
        ChessBoard chessBoard = new ChessBoard("Player1");
        Horse horse = new Horse("White");
        Horse horse1 = new Horse("White");
        chessBoard.board[2][3]=horse1;
        assertFalse(horse.canMoveToPosition(chessBoard,1,1,2,3), "End position the same color");
    }

    @org.junit.jupiter.api.Test
    void moveAsHorse() {
        ChessBoard chessBoard = new ChessBoard("Player1");
        Horse horse = new Horse("White");
        assertFalse(horse.canMoveToPosition(chessBoard,1,1,3,3), "End positon incorrect");
    }

    @org.junit.jupiter.api.Test
    void moveAsHorse2() {
        ChessBoard chessBoard = new ChessBoard("Player1");
        Horse horse = new Horse("White");
        assertFalse(horse.canMoveToPosition(chessBoard,5,6,6,3), "End positon incorrect");
    }

    @org.junit.jupiter.api.Test
    void getSymbol() {
        Horse horse = new Horse("White");
        assertEquals(horse.getSymbol(),"H");
    }
}