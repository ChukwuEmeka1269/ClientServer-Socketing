package socketApp.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {


    public static void main(String[] args) {
      int port = 9800;
        try{
            System.out.println("Listening for connection from port: " + port);
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            System.out.println("We have a lift off!");
            BufferedReader clientInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = clientInput.readLine();
            PrintWriter backToClient = new PrintWriter(socket.getOutputStream(), true);
            backToClient.println("Server says: "+ str);


        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
