package socketApp.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try{
            System.out.println("Sending request....");
            Socket socket = new Socket("localhost", 9800);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Say Hello");
            String userStringInput = userInput.readLine();
            PrintWriter inputToServer = new PrintWriter(socket.getOutputStream(), true);
            inputToServer.println(userStringInput);
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(fromServer.readLine());

        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }
}
