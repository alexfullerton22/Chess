// one.java
import java.util.*;

public class Chess {
   public static void main(String[] args) {
      String[][] board = new String[8][8];

      for (int i = 1; i <= 8; i++) {
         for (int j = 1; j <= 8; j++) {
            if ((i % 2) != 0) {
               if ((j % 2) != 0) {
                  board[i][j] = "w";
               }
               else {
                  board[i][j] = "b";
               }
            }
            else {
               if ((j %2) == 0) {
                  board[i][j] = "w";
               }
               else {
                  board[i][j] = "b";
               }
            }

         }
      }

   }

///////////////////////////////////////////////////////////////////////////////
   public static void Setup() {
      Piece[][] pieces;
      pieces = new Piece[8][8];   
      
      for (int p = 1; p <= 8; p++) {
         pieces[7][p] = new Piece("pawn", "white", p);
         pieces[2][p] = new Piece("pawn", "black", p);
      }

      for (int r = 1; r <= 8; r += 7) {
         pieces[8][r] = new Piece("rook", "white", r);
         pieces[1][r] = new Piece("rook", "black", r);
      }

      for (int kn = 2; kn <= 7; kn += 5) {
         pieces[8][kn] = new Piece("knight", "white", kn);
         pieces[1][kn] = new Piece("knight", "black", kn);
      }

      for (int b = 3; b <= 6; b += 3) {
         pieces[8][b] = new Piece("bishop", "white", b);
         pieces[1][b] = new Piece("bishop", "black", b);
      }

      pieces[8][4] = new Piece("king", "white", 4);
      pieces[1][4] = new Piece("king", "black", 4);

      pieces[8][5] = new Piece("queen", "white", 5);
      pieces[1][5] = new Piece("queen", "black", 5);
   }
///////////////////////////////////////////////////////////////////////////////

}