package socketApp.reverseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseStringServer {
    public static void main(String[] args) {
        int port = 8585;
        try{
            System.out.println("Server is on the roll");
            System.out.println("<><><><><><><><><><><>><><><><><>");
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            System.out.println("We have a lift off!!!!!!");
            BufferedReader readDataFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String dataFromClient = readDataFromClient.readLine();
            PrintWriter sendResultToClient = new PrintWriter(socket.getOutputStream(), true);
            sendResultToClient.println("Your string to be reversed: " +
                    reverseString(dataFromClient));

        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }

    static String reverseString(String word){
        StringBuilder string = new StringBuilder(word);
        return string.reverse().toString();

    }
}
