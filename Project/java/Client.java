import java.util.*

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Player 1 name: ");
    String nameone = scan.nextLine();
    Player p1 = new Player(nameone);
      
    System.out.print("Enter Player 2 name: ");
    String nametwo = scan.nextLine();
    Player p2 = new Player(nametwo);
    
    Chess chess = new Chess();
  }
}