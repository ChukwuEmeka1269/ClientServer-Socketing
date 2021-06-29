package socketApp.factorialSocket;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) {
        int port = 9000;
        try{
            System.out.println("Waiting for data from client on port " + port);
            System.out.println("Waiting...................................");
            ServerSocket serverSocket = new ServerSocket(port);
            Socket connectToClient = serverSocket.accept();
            System.out.println("We have a lift off!! \nWhat is your request?");
            BufferedReader readDataFromClient = new BufferedReader(new InputStreamReader(connectToClient.getInputStream()));
            int dataConvertedToString = Integer.parseInt(readDataFromClient.readLine());
            PrintWriter dataToClient = new PrintWriter(connectToClient.getOutputStream(), true);
            dataToClient.println("Factorial of "+ dataConvertedToString + " = " + numberFactorial(dataConvertedToString));



        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }

    public static int numberFactorial(int number){
        int factorial = 1;
        for(int index=1; index<=number; index++){
            factorial = factorial * index;
        }

        return factorial;

    }
}
