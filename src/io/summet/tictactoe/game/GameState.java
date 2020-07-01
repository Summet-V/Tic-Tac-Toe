package io.summet.tictactoe.game;

public class GameState {
    private static Team turn = Team.NONE;

    public static void setTurn(Team team) {
        turn = team;
    }

    public static Team getTurn() {
        return turn;
    }
}
