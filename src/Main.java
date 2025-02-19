import client.ClientController;
import client.ClientGUI;
import server.FileStorage;
import server.ServerController;
import server.ServerWindow;

public class Main {
    public static void main(String[] args) {

        ServerController serverController = new ServerController(new ServerWindow(), new FileStorage());
        new ClientController(new ClientGUI(), serverController);
        new ClientController(new ClientGUI(), serverController);
    }
}