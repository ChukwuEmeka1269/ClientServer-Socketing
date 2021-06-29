package socketApp.multiplySocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiplyServer {
    public static void main(String[] args) {
        int port = 8989;
        try{
            System.out.println("Server rolling <><><><><><><><>");
            System.out.println("Listening on port " + port );
            ServerSocket serverSocket = new ServerSocket(port);
            Socket acceptClientConnection = serverSocket.accept();
            BufferedReader readClientData = new BufferedReader(new InputStreamReader(acceptClientConnection.getInputStream()));
            int int1 = Integer.parseInt(readClientData.readLine());
            int int2 = Integer.parseInt(readClientData.readLine());
            PrintWriter sendResultToClient = new PrintWriter(acceptClientConnection.getOutputStream(), true);
            sendResultToClient.println("Result of "+ int1 + " * " + int2 + " = "+ multiply(int1,int2));
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

    static int multiply(int num1, int num2){
        return num1 * num2;
    }
}
