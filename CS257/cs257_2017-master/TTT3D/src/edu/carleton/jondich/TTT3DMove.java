package edu.carleton.jondich;

/**
 * This class represents a single move on a 4x4x4 3D tic-tac-toe board.
 * <p>
 * FOR DISCUSSION:<br>
 * What do you think about using public instance variables
 * here instead of getters like "public int getRow()"?<br>
 * What do you think about including the player in this class?
 *
 * @author Jeff Ondich
 * @version 30 March 2017
 */
public class TTT3DMove {
    public int level;
    public int row;
    public int column;
    public Character player;

    TTT3DMove(int level, int row, int column, Character player) {
        this.level = level;
        this.row = row;
        this.column = column;
        this.player = player;
    }
}
