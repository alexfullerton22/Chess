public class Input {
   String move;
   String start;
   public Input(String start, String move) {
      this.start = start.toLowerCase();
      this.move = move.toLowerCase();
   }
   
   public String getMove() {
      return move;
   }
   
   public String getStart() {
      return start;
   }
   
}