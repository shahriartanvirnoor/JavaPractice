import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TFWriter {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("newFile.txt",true);
            BufferedWriter bf = new BufferedWriter(writer);
            bf.newLine();
            

            bf.write("Do i know you/");
            bf.newLine();
            bf.write("Where are you from?");
            bf.close();
        }  
        catch(IOException e) {
            System.out.println("There was a problem!");
            e.printStackTrace();
        }
        
    }
    
}
