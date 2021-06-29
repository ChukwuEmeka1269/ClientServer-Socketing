package socketApp.factorialSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {
    public static void main(String[] args) {
        try{
            System.out.println("Client Started");
            Socket clientSocket = new Socket("127.0.0.1", 9000);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            int anInt = Integer.parseInt(userInput.readLine());
            PrintWriter sendNumberToServer = new PrintWriter(clientSocket.getOutputStream(), true);
            sendNumberToServer.println(anInt);
            BufferedReader getDataFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println( getDataFromServer.readLine());

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
