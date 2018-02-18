// one.java
import java.util.*;

public class Chess {      
   public static void main(String[] args) {
      String[][] board = new String[8][8];

      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
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
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter starting position of piece");
      String start = scan.nextLine();
      System.out.println("Enter new postion");
      String move = scan.nextLine();
      Input input = new Input(start, move);
      
      String stringrow = start.substring(0, 1);
      int srow = Integer.parseInt();
      String scol = start.substring(1, 2);
      
      System.out.println(srow + " " + scol);
      
      

   }

///////////////////////////////////////////////////////////////////////////////
   Piece[][] pieces = new Piece[8][8];   


   public void Setup() {
      
      for (int p = 0; p < 8; p++) {
         pieces[7][p] = new Piece("pawn", "white", p);
         pieces[2][p] = new Piece("pawn", "black", p);
      }

      for (int r = 0; r < 8; r += 7) {
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
