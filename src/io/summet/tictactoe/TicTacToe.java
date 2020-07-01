package io.summet.tictactoe;

import io.summet.tictactoe.board.Board;
import io.summet.tictactoe.game.GameState;
import io.summet.tictactoe.game.Team;
import io.summet.tictactoe.io.Input;
import io.summet.tictactoe.io.Logger;

public class TicTacToe {

    public static void main(String[] args){
        Board board = new Board();
        Input input = new Input();

        GameState.setTurn(Team.X);
        while (board.getWinner() == Team.NONE) {
            Logger.board(board);
            Logger.turn(GameState.getTurn());
            byte ceilId = input.awaitTurn();

            if (board.getTeam(ceilId) == Team.NONE) {
                board.setTeam(ceilId, GameState.getTurn());
                GameState.setTurn(GameState.getTurn() == Team.X ? Team.O : Team.X);
            } else {
                Logger.cantReplace();
            }
        }

        Logger.board(board);
        Logger.winner(board.getWinner());
        input.awaitExit();
    }
}
