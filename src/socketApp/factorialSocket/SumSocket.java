package socketApp.factorialSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SumSocket {
    public static void main(String[] args) {
        int port = 9085;
        try{
            System.out.println("Server started***************");
            System.out.println("Listening on port " + port);
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            System.out.println("Lift off!!!!!!!!!");
            BufferedReader readDataFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            int int1 = Integer.parseInt(readDataFromClient.readLine());
            int int2 = Integer.parseInt(readDataFromClient.readLine());
            PrintWriter sendResultToClient = new PrintWriter(socket.getOutputStream(), true);
            sendResultToClient.println("The sum of " + int1 + " and " + int2 +" = "+ addNumbers(int1, int2));

        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }

    static int addNumbers(int num1, int num2){
        return  num1 + num2;
    }
}
