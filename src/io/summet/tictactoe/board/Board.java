package io.summet.tictactoe.board;

import io.summet.tictactoe.game.Team;

public class Board {
    public final Cell[] cells;
    public final int[][] lines = {
        {0, 1, 2},
        {3, 4, 5},
        {6, 7, 8},
        {0, 3, 6},
        {1, 4, 7},
        {2, 5, 8},
        {0, 4, 8},
        {2, 4, 6}
    };

    public Board() {
        cells = new Cell[9];
        for (byte i = 0; i < cells.length; i++) {
            cells[i] = new Cell(i);
        }
    }

    public Team team(int id) {
        return cells[id].team;
    }

    public void setTeam(int id, Team team) {
        cells[id].team = team;
    }

    public Team getTeam(int id) {
        return cells[id].team;
    }

    public Team getWinner() {
        for (int[] line : lines) {
            int a = line[0];
            int b = line[1];
            int c = line[2];

            if (team(a) == team(b) && team(a) == team(c)) {
                return team(a);
            }
        }

        return Team.NONE;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Cell cell : cells) {
            builder.append(cell.id == 2 || cell.id == 5 ? cell.toString() + "\r\n" : cell.toString());
        }

        return builder.toString();
    }
}
