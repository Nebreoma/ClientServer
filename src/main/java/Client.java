import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
//public static final int PORT = 127.0.0.1;
        try(Socket clientSocket = new Socket("localhost", Server.PORT);
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
            ){
            writer.println("Eva");
            System.out.println(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
