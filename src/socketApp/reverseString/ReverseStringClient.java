package socketApp.reverseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ReverseStringClient {
    public static void main(String[] args) {
        try{
            System.out.println("Client is processing request.............");
            Socket clientSocket = new Socket("127.0.0.1", 8585);
            BufferedReader readUserInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Type a word here and I'll reverse it: ");
            String userInput = readUserInput.readLine();
            PrintWriter sendDataToClient = new PrintWriter(clientSocket.getOutputStream(), true);
            sendDataToClient.println(userInput);
            BufferedReader readResultFromServer = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));
            System.out.println(readResultFromServer.readLine());

        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
