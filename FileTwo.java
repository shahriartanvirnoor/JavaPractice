import java.io.*;

public class FileTwo {
    public static void main(String args[]) {
        File file = new File("hello.txt");
        try {
            FileReader reader = new FileReader(file);
            if(file.exists()) {
            System.out.println("File exists!");
            System.out.println("---------------------");
            System.out.println("File operation begin");
            System.out.println("---------------------");
            int p;
            while((p = reader.read())!=-1){
                System.out.print((char)p);
            } 
            reader.close();
            
        } else {
            System.out.println("File not found!");
        }
    } catch(IOException ie) {
        System.out.println(ie);
    }

    }
}
/*
 * FileReader.read() method bring the byte as integer and it also keep track where it was
 * after it's previous work.
 * That's a good task.
 * I don't need to think about this one
 * Then there is another think that if we directly work with FileReader then it require much system 
 * Resources as every time it go to bring the byte it call the disk again and again
 * That's why it is a good and recommend practice to use BufferedReader that wrap the file
 * as a buffer that itself not a permanent memory. 
 * Caustious: you have to close FileReader when you don't need it anymore */
