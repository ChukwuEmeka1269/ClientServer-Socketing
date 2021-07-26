package socketApp.fileIO;

import java.io.*;

public class WriteToAFile {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/user/Desktop/ioTest/demo-copy.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("/Users/user/Desktop/ioTest/demo.txt"));
            String line ;
            while((line= reader.readLine()) != null){
                writer.write(line);
            }



            writer.close();
            reader.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
