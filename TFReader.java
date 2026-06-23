import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TFReader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("File opening error!");
            e.printStackTrace();
    
        }
    }
}
        
