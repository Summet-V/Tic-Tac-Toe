package io.summet.tictactoe.io;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getInputString() {
        return scanner.next();
    }

    public boolean applyCommands(String str) {
        boolean applied = true;

        if (str.equals("quit")) {
            System.exit(0);
        } else {
            applied = false;
        }

        return applied;
    }

    public byte awaitTurn() {
        while (true) {
            String result = getInputString();
            if (applyCommands(result)) continue;

            try {
                int value = Integer.parseInt(result);
                if (value <= 0 || value >= 10) {
                    Logger.invalid(result);
                } else {
                    return (byte) (Integer.parseInt(result) - 1);
                }
            } catch (NumberFormatException e) {
                Logger.invalid(result);
            }
        }
    }

    public void awaitExit() {
        Logger.exit();
        scanner.next();
    }
}
