package socketApp.factorialSocket;

import socketApp.multiplySocket.MultiplyClient;

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
            MultiplyClient.numbers(clientSocket, readClientData, number1);

        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
