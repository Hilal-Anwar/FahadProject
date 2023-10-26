package org.graded.classes.game;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String box = """
                +−−−−+−−−−+−−−−+
                | a  | b  | c  |
                |−−−−|−−−−|−−−−|
                | d  | e  | f  |
                |−−−−|−−−−|−−−−|
                | g  | h  | i  |
                +−−−−+−−−−+−−−−+
                """;
        String box_in_memory = """
                +−−−−+−−−−+−−−−+
                | a  | b  | c  |
                |−−−−|−−−−|−−−−|
                | d  | e  | f  |
                |−−−−|−−−−|−−−−|
                | g  | h  | i  |
                +−−−−+−−−−+−−−−+
                """;
        String[][] p = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        int row, column;
        Scanner in = new Scanner(System.in);
        String sign = "X";
        for (int k = 1; k <= 9; k++) {
            System.out.println("Enter the row and column");
            row = in.nextInt() - 1;
            column = in.nextInt() - 1;
            System.out.println(row + "   " + column);
            if (checkValidOrNot(row, column)) {
                System.out.println("Invalid row or column please put the correct " +
                        "\nrange that is 1 to 3 in both row  column");
                k--;
            } else {
                System.out.println("\033[H\033[J");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == row && j == column)
                            box = box.replace(p[i][j], sign);
                        else box = box.replace(p[i][j], " ");

                    }
                    System.out.println();
                }
                box_in_memory = box_in_memory.replace(p[row][column], sign);
                sign = sign.equals("X") ? "O" : "X";
                System.out.println(box);
                box = box_in_memory;
            }
        }
    }

    private static boolean checkValidOrNot(int row, int column) {
        return (row > 3 ||row < 0 || column > 3 || column < 0);
    }
}
