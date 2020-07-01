package io.summet.tictactoe.io;

import io.summet.tictactoe.board.Board;
import io.summet.tictactoe.game.Team;

public class Logger {
    private static void log(Object x) {
        newLine();
        System.out.println(x);
    }

    private static void newLine() {
        System.out.println();
    }

    public static void winner(Team team) {
        log("Winner is " + team.name() + "!");
    }

    public static void turn(Team team) {
        log("Now " + team.name() + " turn:");
    }

    public static void cantReplace() {
        log("Can't replace cell!");
    }

    public static void invalid(Object x) {
        log("Invalid input: \"" + x + "\"!");
    }

    public static void exit() {
        log("Enter any text to exit... ");
    }

    public static void board(Board board) {
        log(board.toString());
    }
}
