package io.summet.tictactoe.board;

import io.summet.tictactoe.game.Team;

public class Cell {
    public final byte id;
    public Team team;

    public Cell(byte id) {
        this.id = id;
        this.team = Team.NONE;
    }

    @Override
    public String toString() {
        return team == Team.NONE ? "[ ]" : "[" + team.name() + "]";
    }
}
