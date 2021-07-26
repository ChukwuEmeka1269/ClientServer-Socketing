package socketApp.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class StreamsEx {
    public static void main(String[] args) throws IOException {
        int port = 9870;
       try{
           System.out.println("Starting Server............");
           System.out.println("Listening for connection on Port " + port );
           ServerSocket serverSocket = new ServerSocket(port);
           Socket socket = serverSocket.accept();
           System.out.println("Connection Established!");
           System.out.println("Houston, we have a lift off!!!!!!");
           BufferedReader readDataFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           String dataFromClient = readDataFromClient.readLine();
           PrintWriter sendResponseToClient = new PrintWriter(socket.getOutputStream(), true );
           sendResponseToClient.println(greetUser(dataFromClient));



       }
       catch(IOException ex){
           ex.printStackTrace();
       }
    }

    static String greetUser(String name){
        return "Hello, " + name + ". How are you today?";
    }
}
