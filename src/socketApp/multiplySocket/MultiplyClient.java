package socketApp.multiplySocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiplyClient {
    public static void main(String[] args) {
        try{
            System.out.println("Client Processing.............");
            Socket clientSocket = new Socket("127.0.0.1", 8989);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter first number: ");
            int int1 = Integer.parseInt(userInput.readLine());
            System.out.print("Enter second number: ");
            numbers(clientSocket, userInput, int1);

        } catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static void numbers(Socket clientSocket, BufferedReader userInput, int int1) throws IOException {
        int int2 = Integer.parseInt(userInput.readLine());
        PrintWriter writeToServer = new PrintWriter(clientSocket.getOutputStream(), true);
        writeToServer.println(int1);
        writeToServer.println(int2);
        BufferedReader readResultFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println(readResultFromServer.readLine());
    }
}
