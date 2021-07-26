package socketApp.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class StreamsClient {
    public static void main(String[] args) {
        int port = 9870;
       try{
           System.out.println("Client preparing request.............");
           System.out.println("Connecting to Server on port " + port);
           Socket clientSocket = new Socket("127.0.0.1", port);
           BufferedReader readUserInput =  new BufferedReader(new InputStreamReader(System.in));
           System.out.println("What's your name?");
           String useInput = readUserInput.readLine();
           PrintWriter sendDataToServer = new PrintWriter(clientSocket.getOutputStream(), true);
           sendDataToServer.println(useInput);
           BufferedReader readResponse = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
           System.out.println("Server says............");
           System.out.println(readResponse.readLine());



       }
       catch(IOException ex){
           ex.printStackTrace();
       }

    }
}
