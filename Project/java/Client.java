public class Client {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Player 1 name: ");
      String nameone = scan.nextLine();
      Player p1 = new Player(nameone);
      
      System.out.println("Enter Player 2 name: ");
      String nametwo = scan.nextLine();
      Player p2 = new Player(nametwo);
   }
}