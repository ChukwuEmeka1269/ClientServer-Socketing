package socketApp.factorialSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SumClient {
    public static void main(String[] args) {
        try{
            System.out.println("Client processing.........");
            Socket clientSocket = new Socket("127.0.0.1", 9085);
            BufferedReader readClientData = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first number: ");
            int number1 = Integer.parseInt(readClientData.readLine());
            System.out.println("Enter second number: ");
            int number2 = Integer.parseInt(readClientData.readLine());
            PrintWriter numberToServer = new PrintWriter(clientSocket.getOutputStream(), true);
            numberToServer.println(number1);
            numberToServer.println(number2);
            BufferedReader readResultFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println(readResultFromServer.readLine());

        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
