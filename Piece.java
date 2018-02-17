public class Piece {
   private String name;
   private String team;
   private int num;
   public Piece(String name, String team, int num) {
      this.name = name;
      this.team = team;
      this.num = num;
   }

   public int getNum() {
      return num;
   }

   public String getName() {
      return name;
   }

   public String getTeam() {
      return team;
   }
}
