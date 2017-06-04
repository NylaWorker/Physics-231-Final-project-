package edu.carleton.nylaworker;
import java.util.*;

/**
 * Created by Nyla Worker and Sonia Moreno.
 *
 * The main when run in the terminal takes a boardfile and then prints out the indicated method.
 * Sample input: java Main win /Users/nylaworker/cs257assignments-NylaWorker/board.txt
 */

public class Main {
  public static void main(String[] args) {
    TTT3DMover mov = new TTT3DMover();
    TTT3DBoard board;
    if(args.length != 2){
      if (args[0].equals("win")){
        board = new TTT3DBoard(args[1]);
        //TTT3DMove mov2 = new TTT3DMove(1,2,3, 'X');
        //board.printNewBoard(board, mov2);
        List<TTT3DMove> wLst = mov.winningMoves(board);
        if ( wLst.size()==0){
          System.out.println();
          System.out.println("There are no winning moves possible");
          System.out.println();
        }
        else {
          System.out.println("This is/are your winning move/s");
          for (int i = 0; i < wLst.size(); i++) {
            TTT3DMove tempMove = wLst.get(i);
            TTT3DBoard tempBoard = new TTT3DBoard(board, board.getWhoseTurn());
      //      tempBoard.printNewBoard(tempBoard, tempMove);
          }
        }

      }
      else if (args[0].equals("block")){
        board = new TTT3DBoard(args[1]);
        List<TTT3DMove> bLst = mov.blockingMoves(board);
        if ( bLst.size()==0){
          System.out.println();
          System.out.println("There are no blocking moves possible");
          System.out.println();
        }
        else {
          System.out.println("This is/are your blocking move/s");
          for (int i = 0; i < bLst.size(); i++) {
            TTT3DMove tempMove = bLst.get(i);
            TTT3DBoard tempBoard = new TTT3DBoard(board, board.getWhoseTurn());
         //   tempBoard.printNewBoard(tempBoard, tempMove);
          }
        }
      }
      else if (args[0].equals("force")) {
        board = new TTT3DBoard(args[1]);
        List<TTT3DMove> fLst = mov.blockingMoves(board);
        if ( fLst.size()==0){
          System.out.println();
          System.out.println("There are no forcing moves possible");
          System.out.println();
        }
        else {
          System.out.println("This is/are your forcing move/s");
          for (int i = 0; i < fLst.size(); i++) {
            TTT3DMove tempMove = fLst.get(i);
            TTT3DBoard tempBoard = new TTT3DBoard(board, board.getWhoseTurn());
        //    tempBoard.printNewBoard(tempBoard, tempMove);

          }
        }
      }
      else {
        System.out.println();
        System.out.println("Sorry that method doesn't exists");
        System.out.println();
      }


    }
    else{
      System.out.println("Not enough information is given. Try: java block/win/force yourboard.file");
    }

    }
}
