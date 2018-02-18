import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/*
 * a simple static http server
*/
public class Client {

  public static void main(String[] args) throws Exception {
    HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
    server.createContext("/test", new MyHandler());
    server.setExecutor(null); // creates a default executor
    server.start();
  }

  static class MyHandler implements HttpHandler {
    public void handle(HttpExchange t) throws IOException {
      byte [] response = "Welcome Real's HowTo test page".getBytes();
      t.sendResponseHeaders(200, response.length);
      OutputStream os = t.getResponseBody();
      os.write(response);
      os.close();
    }
  }
}




//////////////////////////////////////////////////////////////////////////////////////
//       Scanner scan = new Scanner(System.in);
//       System.out.println("Enter Player 1 name: ");
//       String nameone = scan.nextLine();
//       Player p1 = new Player(nameone);
//       
//       System.out.println("Enter Player 2 name: ");
//       String nametwo = scan.nextLine();
//       Player p2 = new Player(nametwo);
//       
//       
// 